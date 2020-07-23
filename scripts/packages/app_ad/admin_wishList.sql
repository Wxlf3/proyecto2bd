-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_wishList;
DROP PROCEDURE IF EXISTS update_wishList;
DROP PROCEDURE IF EXISTS remove_wishList;
DROP FUNCTION IF EXISTS getIdProduct_wishList;
DROP FUNCTION IF EXISTS getQuantity_wishList;
DROP PROCEDURE IF EXISTS getAll_wishList;
DELIMITER //

CREATE PROCEDURE insert_wishList(IN pnUsername VARCHAR(45), IN pnIdProduct INT, IN pnQuantity INT)
    BEGIN
            INSERT INTO wish_list(username, id_product, quantity)
            VALUES (pnUsername, pnIdProduct, pnQuantity);
    END //

CREATE PROCEDURE update_wishList(IN pnUsername VARCHAR(45), IN pnIdProduct INT, IN pnQuantity INT)
    BEGIN
            UPDATE wish_list
            SET 
            id_product = pnIdProduct,
            quantity = pnQuantity
            WHERE username = pnUsername;
    END //

CREATE PROCEDURE remove_wishList(pnUsername VARCHAR(45))
        BEGIN
            DELETE FROM wish_list
            WHERE username = pnUsername;
    END//

CREATE FUNCTION getIdProduct_wishList(pnUsername VARCHAR(45))
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdProduct INT;
        SET rIdProduct = "";
            SELECT id_product
            INTO rIdProduct
            FROM wish_list
            WHERE username = pnUsername;
    RETURN rIdProduct;
    END //

CREATE FUNCTION getQuantity_wishList(pnUsername VARCHAR(45))
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantity INT;
        SET rQuantity = "";
            SELECT quantity
            INTO rQuantity
            FROM wish_list
            WHERE username = pnUsername;
    RETURN rQuantity;
    END //

CREATE PROCEDURE getAll_wishList()
    BEGIN
            SELECT username, id_product, quantity
            FROM wish_list;
    END//
DELIMITER ;