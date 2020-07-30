-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_userType;
DROP PROCEDURE IF EXISTS update_userType;
DROP PROCEDURE IF EXISTS remove_userType;
DROP FUNCTION IF EXISTS getName_userType;
DROP PROCEDURE IF EXISTS getAll_userType;
DELIMITER //

CREATE PROCEDURE insert_userType(IN pnName VARCHAR(45))
    BEGIN
            INSERT INTO user_type(name)
            VALUES (pnName);
    END //

CREATE PROCEDURE update_userType(IN pnId INT, IN pnName VARCHAR(45))
    BEGIN
            UPDATE user_type
            SET name = pnName
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_userType(IN pnId INT)
        BEGIN
            DELETE FROM user_type
            WHERE id = pnId;
    END//

CREATE FUNCTION getName_userType(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rName VARCHAR(45);
        SET rName = "";
            SELECT name
            INTO rName
            FROM user_type
            WHERE id = vId;
    RETURN rName;
    END //

CREATE PROCEDURE getAll_userType()
    BEGIN
            SELECT id, name
            FROM user_type;
    END//

DELIMITER ;