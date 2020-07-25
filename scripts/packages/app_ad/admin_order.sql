-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_order;
DROP PROCEDURE IF EXISTS update_order;
DROP PROCEDURE IF EXISTS remove_order;
DROP FUNCTION IF EXISTS getPrice_order;
DROP FUNCTION IF EXISTS getQuantity_order;
DROP FUNCTION IF EXISTS getDate_order;
DROP FUNCTION IF EXISTS getUserSeller_order;
DROP FUNCTION IF EXISTS getUserBuyer_order;
DROP FUNCTION IF EXISTS getIdProduct_order;
DROP PROCEDURE IF EXISTS getAll_order;
DELIMITER //

CREATE PROCEDURE insert_order(IN pnPrice DECIMAL(10,2), IN pnQuantity INT, IN pnDate DATETIME, IN pnUserSeller VARCHAR(45), IN pnUserBuyer VARCHAR(45), IN pnIdProduct INT)
    BEGIN
            INSERT INTO `order`(price, quantity, date, user_seller, user_buyer, id_product)
            VALUES (pnPrice, pnQuantity, pnDate, pnUserSeller, pnUserBuyer, pnIdProduct);
    END //

CREATE PROCEDURE update_order(IN pnId int, IN pnPrice DECIMAL(10,2), IN pnQuantity INT, IN pnDate DATETIME, IN pnUserSeller VARCHAR(45), IN pnUserBuyer VARCHAR(45), IN pnIdProduct INT)
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

CREATE FUNCTION getPrice_order(vId INT) 
RETURNS DECIMAL(10,2)
DETERMINISTIC
    BEGIN
        DECLARE rPrice DECIMAL(10,2);
        SET rPrice = 0;
            SELECT price
            INTO rPrice
            FROM `order`
            WHERE id = vId;
    RETURN rPrice;
    END //

CREATE FUNCTION getQuantity_order(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantity INT;
        SET rQuantity = 0;
            SELECT quantity
            INTO rQuantity
            FROM `order`
            WHERE id = vId;
    RETURN rQuantity;
    END //

CREATE FUNCTION getDate_order(vId INT) 
RETURNS DATETIME
DETERMINISTIC
    BEGIN
        DECLARE rDate DATETIME;
        SET rDate = STR_TO_DATE('0,0,0000','%d,%m,%Y');
            SELECT date
            INTO rDate
            FROM `order`
            WHERE id = vId;
    RETURN rDate;
    END //

CREATE FUNCTION getUserSeller_order(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUserSeller VARCHAR(45);
        SET rUserSeller = "";
            SELECT user_seller
            INTO rUserSeller
            FROM `order`
            WHERE id = vId;
    RETURN rUserSeller;
    END //

CREATE FUNCTION getUserBuyer_order(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUserBuyer VARCHAR(45);
        SET rUserBuyer = "";
            SELECT user_buyer
            INTO rUserBuyer
            FROM `order`
            WHERE id = vId;
    RETURN rUserBuyer;
    END //

CREATE FUNCTION getIdProduct_order(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdProduct INT;
        SET rIdProduct = 0;
            SELECT id_product
            INTO rIdProduct
            FROM `order`
            WHERE id = vId;
    RETURN rIdProduct;
    END //

CREATE PROCEDURE getAll_order()
    BEGIN
            SELECT id, price, quantity, date, user_seller, user_buyer, id_product
            FROM `order`;
    END//
DELIMITER ;