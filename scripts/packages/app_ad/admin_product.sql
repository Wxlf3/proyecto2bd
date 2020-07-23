-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_product;
DROP PROCEDURE IF EXISTS update_product;
DROP PROCEDURE IF EXISTS remove_product;
DROP PROCEDURE IF EXISTS getPrice_product;
DROP PROCEDURE IF EXISTS getName_product;
DROP PROCEDURE IF EXISTS getDescription_product;
DROP PROCEDURE IF EXISTS getQuantInStock_product;
DROP PROCEDURE IF EXISTS getIsVisible_product;
DROP PROCEDURE IF EXISTS getAverageScore_product;
DROP PROCEDURE IF EXISTS getIdCategory_product;
DROP PROCEDURE IF EXISTS getUsernameSeller_product;
DROP PROCEDURE IF EXISTS getIdDeliveryType_product;
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

CREATE PROCEDURE getPrice_product(vId INT)
    BEGIN
        DECLARE rPrice DECIMAL(10,2);
        SELECT price
        FROM product
        WHERE id = vId;
    END//

CREATE PROCEDURE getName_product(vId INT)
    BEGIN
        DECLARE rName VARCHAR(45);
        SELECT name
        FROM product
        WHERE id = vId;
    END//

CREATE PROCEDURE getDescription_product(vId INT)
    BEGIN
        DECLARE rDescription VARCHAR(150);
        SELECT description
        FROM product
        WHERE id = vId;
    END//

CREATE PROCEDURE getQuantInStock_product(vId INT)
    BEGIN
        DECLARE rQuantInStock INT;
        SELECT quant_in_stock
        FROM product
        WHERE id = vId;
    END//

CREATE PROCEDURE getIsVisible_product(vId INT)
    BEGIN
        DECLARE rIsVisible TINYINT;
        SELECT is_visible
        FROM product
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAverageScore_product(vId INT)
    BEGIN
        DECLARE rAverageScore DECIMAL(4,2);
        SELECT average_score
        FROM product
        WHERE id = vId;
    END//  

CREATE PROCEDURE getIdCategory_product(vId INT)
    BEGIN
        DECLARE rIdCategory INT;
        SELECT id_category
        FROM product
        WHERE id = vId;
    END//    

CREATE PROCEDURE getUsernameSeller_product(vId INT)
    BEGIN
        DECLARE rUsernameSeller VARCHAR(45);
        SELECT username_seller
        FROM product
        WHERE id = vId;
    END//  

CREATE PROCEDURE getIdDeliveryType_product(vId INT)
    BEGIN
        DECLARE rDeliveryType INT;
        SELECT id_delivery_type
        FROM product
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_product()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, price, name, description, quant_in_stock, is_visible, average_score, id_category, username_seller, id_delivery_type
            FROM product;
    END//
DELIMITER ;