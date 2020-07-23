-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_delivery_type;
DROP PROCEDURE IF EXISTS update_delivery_type;
DROP PROCEDURE IF EXISTS remove_delivery_type;
DROP PROCEDURE IF EXISTS getDescription_delivery_type;
DROP PROCEDURE IF EXISTS getAll_delivery_type;
DROP PROCEDURE IF EXISTS getId_delivery_type;
DELIMITER //

CREATE PROCEDURE insert_delivery_type(IN pnDescription VARCHAR(45))
    BEGIN
            INSERT INTO delivery_type(description)
            VALUES (pnDescription);
    END //

CREATE PROCEDURE update_delivery_type(IN pnId INT, IN pnDescription VARCHAR(45))
    BEGIN
            UPDATE category
            SET description = pnDescription
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_delivery_type(IN pnId INT)
        BEGIN
            DELETE FROM delivery_type
            WHERE id = pnId;
    END//

CREATE PROCEDURE getDescription_delivery_type(vId INT)
    BEGIN
        DECLARE rDescription VARCHAR(45);
        SELECT description
        FROM delivery_type
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_delivery_type()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, description
            FROM delivery_type;
    END//

CREATE PROCEDURE getId_delivery_type(pnDescription VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM delivery_type
        WHERE description = pnDescription;
    END //
DELIMITER ;