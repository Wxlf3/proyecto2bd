-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_shoppingCart;
DROP PROCEDURE IF EXISTS update_shoppingCart;
DROP PROCEDURE IF EXISTS remove_shoppingCart;
DROP FUNCTION IF EXISTS getIdProduct_shoppingCart;
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
            id_product = pnIdProduct,
            quantity = pnQuantity
            WHERE username = pnUsername;
    END //

CREATE PROCEDURE remove_shoppingCart(IN pnUsername INT)
        BEGIN
            DELETE FROM shopping_cart
            WHERE username = pnUsername;
    END//

CREATE FUNCTION getIdProduct_shoppingCart(pnUsername INT)
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdProduct INT;
        SET rIdProduct = 0;
            SELECT id_product
            INTO rIdProduct
            FROM shopping_cart
        WHERE username = pnUsername;
    RETURN rIdProduct;
    END //

CREATE FUNCTION getQuantity_shoppingCart(pnUsername INT)
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rQuantity INT;
        SET rQuantity = 0;
            SELECT quantity
            INTO rQuantity
            FROM shopping_cart
        WHERE username = pnUsername;
    RETURN rQuantity;
    END //

CREATE PROCEDURE getAll_shoppingCart()
    BEGIN
            SELECT username, id_product, quantity
            FROM shopping_cart;
    END//
DELIMITER ;