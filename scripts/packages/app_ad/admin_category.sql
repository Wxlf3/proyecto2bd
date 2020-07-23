-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_category;
DROP PROCEDURE IF EXISTS update_category;
DROP PROCEDURE IF EXISTS remove_category;
DROP PROCEDURE IF EXISTS getName_category;
DROP PROCEDURE IF EXISTS getAll_category;
DROP PROCEDURE IF EXISTS getId_category;
DELIMITER //

CREATE PROCEDURE insert_category(IN pnName VARCHAR(10))
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

CREATE PROCEDURE getName_category (vId INT)
    BEGIN
        DECLARE rName VARCHAR(45);
        SELECT name
        FROM category
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_category()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, name
            FROM category;
    END//

CREATE PROCEDURE getId_category(vName VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM category
        WHERE name = vName;
    END //
DELIMITER ;