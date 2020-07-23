-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_wishList;
DROP PROCEDURE IF EXISTS update_wishList;
DROP PROCEDURE IF EXISTS remove_wishList;
DROP PROCEDURE IF EXISTS getIdProduct_wishList;
DROP PROCEDURE IF EXISTS getQuantity_wishList;
DROP PROCEDURE IF EXISTS getAll_product;
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

CREATE PROCEDURE getIdProduct_wishList(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rIdProduct INT;
        SELECT id_product
        FROM wish_list
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getQuantity_wishList(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rQuantity INT;
        SELECT quantity
        FROM wish_list
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getAll_wishList()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT username, id_product, quantity
            FROM wish_list;
    END//
DELIMITER ;