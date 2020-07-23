-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_category;
DROP PROCEDURE IF EXISTS update_category;
DROP PROCEDURE IF EXISTS remove_category;
DROP FUNCTION IF EXISTS getName_category;
DROP PROCEDURE IF EXISTS getAll_category;
DROP FUNCTION IF EXISTS getId_category;
DELIMITER //

CREATE PROCEDURE insert_category(IN pnName VARCHAR(45))
    BEGIN
            INSERT INTO category(name)
            VALUES (pnName);
    END //

CREATE PROCEDURE update_category(IN pnId INT, IN pnName VARCHAR(45))
    BEGIN
            UPDATE category
            SET name = pnName
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_category(IN pnId INT)
        BEGIN
            DELETE FROM category
            WHERE id = pnId;
    END//

CREATE FUNCTION getName_category(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rName VARCHAR(45);
        SET rName = "";
            SELECT name
            INTO rName
            FROM category
            WHERE id = vId;
    RETURN rName;
    END //

CREATE PROCEDURE getAll_category()
    BEGIN
            SELECT id, name
            FROM category;
    END//

CREATE FUNCTION getId_category(vName VARCHAR(45)) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rId INT;
        SET rId = 0;
            SELECT id
            INTO rId
            FROM category
            WHERE name = vName;
    RETURN rId;
    END //
DELIMITER ;