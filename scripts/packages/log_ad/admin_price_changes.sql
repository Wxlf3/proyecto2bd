-- Connected from LOG_AD

USE `log_ad`;
DROP procedure IF EXISTS `insert_priceChanges`;
DROP procedure IF EXISTS `update_priceChanges`;
DROP procedure IF EXISTS `remove_priceChanges`;
DROP function IF EXISTS `getIdProduct_priceChanges`;
DROP function IF EXISTS `getDate_priceChanges`;
DROP function IF EXISTS `getPrevPrice_priceChanges`;
DROP function IF EXISTS `getCurrentPrice_priceChanges`;
DROP procedure IF EXISTS `getAll_priceChanges`;
DELIMITER //

CREATE PROCEDURE insert_priceChanges(IN pnIdProduct INT, IN pnDate DATETIME, IN pnPrevPrice INT, IN pnCurrentPrice INT)
    BEGIN
            INSERT INTO price_changes(id_product, date, prev_price, current_price)
            VALUES (pnIdProduct, pnDate, pnPrevPrice, pnCurrentPrice);
    END //

CREATE PROCEDURE update_priceChanges(IN pnIdProduct INT, IN pnDate DATETIME, IN pnPrevPrice INT, IN pnCurrentPrice INT)
    BEGIN
            UPDATE price_changes
            SET id_product = pnIdProduct,
				date = pnDate,
				prev_price = pnPrevPrice,
                current_price = pnCurrentPrice
            WHERE id_product = pnIdProduct;
    END //
    
CREATE PROCEDURE remove_priceChanges(IN pnId INT)
	BEGIN
            DELETE FROM price_changes
            WHERE id = pnId;
    END//
    
CREATE FUNCTION getIdProduct_priceChanges(vId INT)
RETURNS INT
BEGIN
	DECLARE result INT;
    SET result = 0;
    SELECT id_product
    INTO result
    FROM price_changes
    WHERE id = vId;
RETURN result;
END//

CREATE FUNCTION getDate_priceChanges(vId INT)
RETURNS DATETIME
BEGIN
	DECLARE result DATETIME;
    SET result = STR_TO_DATE('0,0,0000','%d,%m,%Y');
    SELECT date
    INTO result
    FROM price_changes
    WHERE id = vId;
RETURN result;
END//

CREATE FUNCTION getPrevPrice_priceChanges(vId INT)
RETURNS DECIMAL(10,2)
BEGIN
	DECLARE result DECIMAL(10,2);
    SET result = 0;
    SELECT prev_price
    INTO result
    FROM price_changes
    WHERE id = vId;
RETURN result;
END//

CREATE FUNCTION getCurrentPrice_priceChanges(vId INT)
RETURNS DECIMAL(10,2)
BEGIN
	DECLARE result DECIMAL(10,2);
    SET result = 0;
    SELECT current_price
    INTO result
    FROM price_changes
    WHERE id = vId;
RETURN result;
END//

CREATE PROCEDURE getAll_priceChanges()
BEGIN
	SELECT id, id_product, date, prev_price, current_price
    FROM price_changes;
END//

DELIMITER ;