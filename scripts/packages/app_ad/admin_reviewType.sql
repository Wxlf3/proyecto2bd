-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_reviewType;
DROP PROCEDURE IF EXISTS update_reviewType;
DROP PROCEDURE IF EXISTS remove_reviewType;
DROP PROCEDURE IF EXISTS getName_reviewType;
DROP PROCEDURE IF EXISTS getAll_reviewType;
DROP PROCEDURE IF EXISTS getId_reviewType;
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

CREATE PROCEDURE getName_reviewType(vId INT)
    BEGIN
        DECLARE rName VARCHAR(45);
        SELECT name
        FROM review_type
        WHERE id = vId;
    END//

CREATE PROCEDURE getAll_reviewType()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, name
            FROM review_type;
    END//

CREATE PROCEDURE getId_reviewType(vName VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM review_type
        WHERE name = vName;
    END //
DELIMITER ;