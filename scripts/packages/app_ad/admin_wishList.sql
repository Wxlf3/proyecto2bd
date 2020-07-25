-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_wishList;
DROP PROCEDURE IF EXISTS update_wishList;
DROP PROCEDURE IF EXISTS remove_wishList;
DROP PROCEDURE IF EXISTS remove_wishList_with_username;
DROP PROCEDURE IF EXISTS remove_wishList_with_idProduct;
DROP PROCEDURE IF EXISTS get_wishList_with_username;
DROP PROCEDURE IF EXISTS get_wishList_with_idProduct;
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
            SET quantity = pnQuantity
            WHERE username = pnUsername AND id_product = pnIdProduct;
    END //

CREATE PROCEDURE remove_wishList(IN pnUsername VARCHAR(45), IN pnIdProduct INT)
	BEGIN
            DELETE FROM wish_list
            WHERE username = pnUsername AND id_product = pnIdProduct;
    END//
    
CREATE PROCEDURE remove_wishList_with_username(IN pnUsername VARCHAR(45))
	BEGIN
            DELETE FROM wish_list
            WHERE username = pnUsername;
    END//
    
CREATE PROCEDURE remove_wishList_with_idProduct(IN pnIdProduct INT)
	BEGIN
            DELETE FROM wish_list
            WHERE id_product = pnIdProduct;
    END//

CREATE PROCEDURE get_wishList_with_username(IN pnUsername VARCHAR(45))
    BEGIN
		SELECT username, id_product, quantity
		FROM wish_list
		WHERE username = pnUsername;
    END //
    
CREATE PROCEDURE get_wishList_with_idProduct(IN pnIdProduct INT)
    BEGIN
		SELECT username, id_product, quantity
		FROM wish_list
		WHERE id_product = pnIdProduct;
    END //

CREATE FUNCTION getQuantity_wishList(pnUsername VARCHAR(45), pnIdProduct INT)
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantity INT;
        SET rQuantity = 0;
            SELECT quantity
            INTO rQuantity
            FROM wish_list
            WHERE username = pnUsername AND id_product = pnIdProduct;
    RETURN rQuantity;
    END //

CREATE PROCEDURE getAll_wishList()
    BEGIN
            SELECT username, id_product, quantity
            FROM wish_list;
    END//
DELIMITER ;