-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_picture;
DROP PROCEDURE IF EXISTS update_picture;
DROP PROCEDURE IF EXISTS remove_picture;
DROP FUNCTION IF EXISTS getPath_picture;
DROP FUNCTION IF EXISTS getIdProduct_picture;
DROP PROCEDURE IF EXISTS getAll_picture;
DROP FUNCTION IF EXISTS getId_picture;
DELIMITER //

CREATE PROCEDURE insert_picture(IN pnPath VARCHAR(60), IN pnIdProduct INT)
    BEGIN
            INSERT INTO picture(path, id_product)
            VALUES (pnPath, pnIdProduct);
    END //

CREATE PROCEDURE update_picture(IN pnId INT, IN pnPath VARCHAR(60), IN pnIdProduct INT)
    BEGIN
            UPDATE picture
            SET 
            path = pnPath,
            id_product = pnIdProduct
            WHERE id = pnId;
    END //
    
CREATE PROCEDURE remove_picture(IN pnId INT)
        BEGIN
            DELETE FROM picture
            WHERE id = pnId;
    END//

CREATE FUNCTION getPath_picture(vId INT) 
RETURNS VARCHAR(60)
DETERMINISTIC
    BEGIN
        DECLARE rPath VARCHAR(60);
        SET rPath = "";
            SELECT path
            INTO rPath
            FROM picture
            WHERE id = vId;
    RETURN rPath;
    END //

CREATE FUNCTION getIdProduct_picture(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdProduct INT;
        SET rIdProduct =0;
            SELECT id_product
            INTO rIdProduct
            FROM picture
            WHERE id = vId;
    RETURN rIdProduct;
    END //

CREATE PROCEDURE getAll_picture()
    BEGIN
            SELECT id, path, id_product
            FROM picture;
    END//

CREATE FUNCTION getId_picture(vPath VARCHAR(60))
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rId INT;
        SET rId = 0;
            SELECT id
            INTO rId
            FROM picture
            WHERE path = vPath;
    RETURN rId;
    END //
DELIMITER ;