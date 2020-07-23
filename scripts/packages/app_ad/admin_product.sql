-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_product;
DROP PROCEDURE IF EXISTS update_product;
DROP PROCEDURE IF EXISTS remove_product;
DROP FUNCTION IF EXISTS getPrice_product;
DROP FUNCTION IF EXISTS getName_product;
DROP FUNCTION IF EXISTS getDescription_product;
DROP FUNCTION IF EXISTS getQuantInStock_product;
DROP FUNCTION IF EXISTS getIsVisible_product;
DROP FUNCTION IF EXISTS getAverageScore_product;
DROP FUNCTION IF EXISTS getIdCategory_product;
DROP FUNCTION IF EXISTS getUsernameSeller_product;
DROP FUNCTION IF EXISTS getIdDeliveryType_product;
DROP PROCEDURE IF EXISTS getAll_product;
DELIMITER //

CREATE PROCEDURE insert_product(IN pnPrice DECIMAL(10,2), IN pnName VARCHAR(45), IN pnDescription VARCHAR(150), IN pnQuantInStock INT, IN pnIsVisible TINYINT, IN pnAverageScore DECIMAL(4,2), IN pnIdCategory INT, IN pnUsernameSeller VARCHAR(45), IN pnIdDeliveryType INT)
    BEGIN
            INSERT INTO product(price, name, description, quant_in_stock, is_visible, average_score, id_category, username_seller, id_delivery_type)
            VALUES (pnPrice, pnName, pnDescription, pnQuantInStock, pnIsVisible, pnAverageScore, pnIdCategory, pnUsernameSeller, pnIdDeliveryType);
    END //

CREATE PROCEDURE update_product(IN pnId INT, IN pnPrice DECIMAL(10,2), IN pnName VARCHAR(45), IN pnDescription VARCHAR(150), IN pnQuantInStock INT, IN pnIsVisible TINYINT, IN pnAverageScore DECIMAL(4,2), IN pnIdCategory INT, IN pnUsernameSeller VARCHAR(45), IN pnIdDeliveryType INT)
    BEGIN
            UPDATE product
            SET 
            price = pnPrice,
            name = pnName,
            description = pnDescription,
            quant_in_stock = pnQuantInStock,
            is_visible = pnIsVisible,
            average_score = pnAverageScore,
            id_category = pnIdCategory,
            username_seller = pnUsernameSeller,
            id_delivery_type = pnIdDeliveryType
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_product(IN pnId INT)
        BEGIN
            DELETE FROM product
            WHERE id = pnId;
    END//

CREATE FUNCTION getPrice_product(vId INT) 
RETURNS DECIMAL(10,2)
DETERMINISTIC
    BEGIN
        DECLARE rPrice DECIMAL(10,2);
        SET rPrice = 0;
            SELECT price
            INTO rPrice
            FROM product
            WHERE id = vId;
    RETURN rPrice;
    END //

CREATE FUNCTION getName_product(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rName VARCHAR(45);
        SET rName = "";
            SELECT name
            INTO rName
            FROM product
            WHERE id = vId;
    RETURN rName;
    END //

CREATE FUNCTION getDescription_product(vId INT) 
RETURNS VARCHAR(150)
DETERMINISTIC
    BEGIN
        DECLARE rDescription VARCHAR(150);
        SET rDescription = "";
            SELECT description
            INTO rDescription
            FROM product
            WHERE id = vId;
    RETURN rDescription;
    END //

CREATE FUNCTION getQuantInStock_product(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantInStock INT;
        SET rQuantInStock = "";
            SELECT quant_in_stock
            INTO rQuantInStock
            FROM product
            WHERE id = vId;
    RETURN rQuantInStock;
    END //

CREATE FUNCTION getIsVisible_product(vId INT) 
RETURNS TINYINT
DETERMINISTIC
    BEGIN
        DECLARE rIsVisible TINYINT;
        SET rIsVisible = "";
            SELECT is_visible
            INTO rIsVisible
            FROM product
            WHERE id = vId;
    RETURN rIsVisible;
    END //

CREATE FUNCTION getAverageScore_product(vId INT) 
RETURNS DECIMAL(4,2)
DETERMINISTIC
    BEGIN
        DECLARE rAverageScore DECIMAL(4,2);
        SET rAverageScore = 0;
            SELECT average_score
            INTO rAverageScore
            FROM product
            WHERE id = vId;
    RETURN rAverageScore;
    END //

CREATE FUNCTION getIdCategory_product(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdCategory INT;
        SET rIdCategory = 0;
            SELECT id_category
            INTO rIdCategory
            FROM product
            WHERE id = vId;
    RETURN rIdCategory;
    END //

CREATE FUNCTION getUsernameSeller_product(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUsernameSeller VARCHAR(45);
        SET rUsernameSeller = "";
            SELECT username_seller
            INTO rUsernameSeller
            FROM product
            WHERE id = vId;
    RETURN rUsernameSeller;
    END //

CREATE FUNCTION getIdDeliveryType_product(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rDeliveryType INT;
        SET rDeliveryType = 0;
            SELECT id_delivery_type
            INTO rDeliveryType
            FROM product
            WHERE id = vId;
    RETURN rDeliveryType;
    END //

CREATE PROCEDURE getAll_product()
    BEGIN
            SELECT id, price, name, description, quant_in_stock, is_visible, average_score, id_category, username_seller, id_delivery_type
            FROM product;
    END//
DELIMITER ;