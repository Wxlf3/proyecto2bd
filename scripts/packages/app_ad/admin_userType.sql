-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_userType;
DROP PROCEDURE IF EXISTS update_userType;
DROP PROCEDURE IF EXISTS remove_userType;
DROP PROCEDURE IF EXISTS getName_userType;
DROP PROCEDURE IF EXISTS getAll_userType;
DROP PROCEDURE IF EXISTS getId_userType;
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

CREATE PROCEDURE getName_userType(vId INT)
    BEGIN
        DECLARE rName VARCHAR(45);
        SELECT name
        FROM user_type
        WHERE id = vId;
    END//

CREATE PROCEDURE getAll_userType()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, name
            FROM user_type;
    END//

CREATE PROCEDURE getId_userType(vName VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM user_type
        WHERE name = vName;
    END //
DELIMITER ;