-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_shoppingCart;
DROP PROCEDURE IF EXISTS update_shoppingCart;
DROP PROCEDURE IF EXISTS remove_shoppingCart;
DROP PROCEDURE IF EXISTS remove_shoppingCart_with_username;
DROP PROCEDURE IF EXISTS remove_shoppingCart_with_idProduct;
DROP PROCEDURE IF EXISTS get_shoppingCart_with_username;
DROP PROCEDURE IF EXISTS get_shoppingCart_with_idProduct;
DROP FUNCTION IF EXISTS getQuantity_shoppingCart;
DROP PROCEDURE IF EXISTS getAll_shoppingCart;
DELIMITER //

CREATE PROCEDURE insert_shoppingCart(IN pnUsername VARCHAR(45), IN pnIdProduct INT, IN pnQuantity INT)
    BEGIN
            INSERT INTO shopping_cart(username, id_product, quantity)
            VALUES (pnUsername, pnIdProduct, pnQuantity);
    END //

CREATE PROCEDURE update_shoppingCart(IN pnUsername VARCHAR(45), IN pnIdProduct INT, IN pnQuantity INT)
    BEGIN
            UPDATE shopping_cart
            SET 
            quantity = pnQuantity
            WHERE username = pnUsername AND id_product = pnIdProduct;
    END //

CREATE PROCEDURE remove_shoppingCart(IN pnUsername VARCHAR(45), IN pnIdProduct INT)
        BEGIN
            DELETE FROM shopping_cart
            WHERE username = pnUsername AND id_product = pnIdProduct;
    END//
    
CREATE PROCEDURE remove_shoppingCart_with_username(IN pnUsername VARCHAR(45))
	BEGIN
            DELETE FROM shopping_cart
            WHERE username = pnUsername;
    END//
    
CREATE PROCEDURE remove_shoppingCart_with_idProduct(IN pnIdProduct INT)
	BEGIN
            DELETE FROM shopping_cart
            WHERE id_product = pnIdProduct;
    END//

CREATE PROCEDURE get_shoppingCart_with_username(IN pnUsername VARCHAR(45))
    BEGIN
		SELECT username, id_product, quantity
		FROM shopping_cart
		WHERE username = pnUsername;
    END //
    
CREATE PROCEDURE get_shoppingCart_with_idProduct(IN pnIdProduct INT)
    BEGIN
		SELECT username, id_product, quantity
		FROM shopping_cart
		WHERE id_product = pnIdProduct;
    END //

CREATE FUNCTION getQuantity_shoppingCart(pnUsername VARCHAR(45), pnIdProduct INT)
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantity INT;
        SET rQuantity = 0;
            SELECT quantity
            INTO rQuantity
            FROM shopping_cart
        WHERE username = pnUsername AND id_product = pnIdProduct;
    RETURN rQuantity;
    END //

CREATE PROCEDURE getAll_shoppingCart(vUser VARCHAR(45))
    BEGIN
            SELECT username, id_product, quantity
            FROM shopping_cart
            WHERE username = vUser;
    END//
DELIMITER ;