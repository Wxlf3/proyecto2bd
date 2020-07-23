-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_picture;
DROP PROCEDURE IF EXISTS update_picture;
DROP PROCEDURE IF EXISTS remove_picture;
DROP PROCEDURE IF EXISTS getPath_picture;
DROP PROCEDURE IF EXISTS getIdProduct_picture;
DROP PROCEDURE IF EXISTS getAll_picture;
DROP PROCEDURE IF EXISTS getId_picture;
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

CREATE PROCEDURE getPath_picture(vId INT)
    BEGIN
        DECLARE rPath VARCHAR(60);
        SELECT path
        FROM picture
        WHERE id = vId;
    END//  

CREATE PROCEDURE getIdProduct_picture(vId INT)
    BEGIN
        DECLARE rIdProduct VARCHAR(60);
        SELECT id_product
        FROM picture
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_picture()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, path, id_product
            FROM picture;
    END//

CREATE PROCEDURE getId_picture(vPath VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM picture
        WHERE path = vPath;
    END //
DELIMITER ;