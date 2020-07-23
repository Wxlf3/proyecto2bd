-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_order;
DROP PROCEDURE IF EXISTS update_order;
DROP PROCEDURE IF EXISTS remove_order;
DROP PROCEDURE IF EXISTS getPrice_order;
DROP PROCEDURE IF EXISTS getQuantity_order;
DROP PROCEDURE IF EXISTS getDate_order;
DROP PROCEDURE IF EXISTS getUserSeller_order;
DROP PROCEDURE IF EXISTS getUserBuyer_order;
DROP PROCEDURE IF EXISTS getIdProduct_order;
DROP PROCEDURE IF EXISTS getAll_order;
DELIMITER //

CREATE PROCEDURE insert_order(IN pnPrice DECIMAL(4,2), IN pnQuantity INT, IN pnDate DATETIME, IN pnUserSeller VARCHAR(45), IN pnUserBuyer VARCHAR(45), IN pnIdProduct INT)
    BEGIN
            INSERT INTO `order`(price, quantity, date, user_seller, user_buyer, id_product)
            VALUES (pnPrice, pnQuantity, pnDate, pnUserSeller, pnUserBuyer, pnIdProduct);
    END //

CREATE PROCEDURE update_order(IN pnId int, IN pnPrice DECIMAL(4,2), IN pnQuantity INT, IN pnDate DATETIME, IN pnUserSeller VARCHAR(45), IN pnUserBuyer VARCHAR(45), IN pnIdProduct INT)
    BEGIN
            UPDATE `order`
            SET 
            price = pnPrice,
            quantity = pnQuantity,
            date = pnDate,
            user_seller = pnUserSeller,
            user_buyer = pnUserBuyer,
            id_product = pnIdProduct
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_order(IN pnId INT)
        BEGIN
            DELETE FROM `order`
            WHERE id = pnId;
    END//

CREATE PROCEDURE getPrice_order(vId INT)
    BEGIN
        DECLARE rPrice DECIMAL(4,2);
        SELECT price
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getQuantity_order(vId INT)
    BEGIN
        DECLARE rQuantity INT;
        SELECT quantity
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getDate_order(vId INT)
    BEGIN
        DECLARE rDate DATETIME;
        SELECT date
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getUserSeller_order(vId INT)
    BEGIN
        DECLARE rUserSeller VARCHAR(45);
        SELECT date
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getUserBuyer_order(vId INT)
    BEGIN
        DECLARE rUserBuyer VARCHAR(45);
        SELECT user_buyer
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getIdProduct_order(vId INT)
    BEGIN
        DECLARE rIdProduct INT;
        SELECT id_product
        FROM `order`
        WHERE id = vId;
    END//

CREATE PROCEDURE getAll_order()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, price, quantity, date, user_seller, user_buyer, id_product
            FROM `order`;
    END//
DELIMITER ;