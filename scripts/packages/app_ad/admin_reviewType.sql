-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_reviewType;
DROP PROCEDURE IF EXISTS update_reviewType;
DROP PROCEDURE IF EXISTS remove_reviewType;
DROP FUNCTION IF EXISTS getName_reviewType;
DROP PROCEDURE IF EXISTS getAll_reviewType;
DROP FUNCTION IF EXISTS getId_reviewType;
DELIMITER //

CREATE PROCEDURE insert_reviewType(IN pnName VARCHAR(45))
    BEGIN
            INSERT INTO review_type(name)
            VALUES (pnName);
    END //

CREATE PROCEDURE update_reviewType(IN pnId INT, IN pnName VARCHAR(45))
    BEGIN
            UPDATE review_type
            SET name = pnName
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_reviewType(IN pnId INT)
        BEGIN
            DELETE FROM review_type
            WHERE id = pnId;
    END//

CREATE FUNCTION getName_reviewType(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rName VARCHAR(45);
        SET rName = "";
            SELECT name
            INTO rName
            FROM review_type
            WHERE id = vId;
    RETURN rName;
    END //

CREATE PROCEDURE getAll_reviewType()
    BEGIN
            SELECT id, name
            FROM review_type;
    END//

CREATE FUNCTION getId_reviewType(vName VARCHAR(45))
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rId INT;
        SET rId = "";
            SELECT id
            INTO rId
            FROM review_type
            WHERE name = vName;
    RETURN rId;
    END //
DELIMITER ;