-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_paymentMethod;
DROP PROCEDURE IF EXISTS update_paymentMethod;
DROP PROCEDURE IF EXISTS remove_paymentMethod;
DROP FUNCTION IF EXISTS getDescription_paymentMethod;
DROP PROCEDURE IF EXISTS getAll_paymentMethod;
DROP FUNCTION IF EXISTS getId_paymentMethod;
DELIMITER //

CREATE PROCEDURE insert_paymentMethod(IN pnDescription VARCHAR(45))
    BEGIN
            INSERT INTO payment_method(description)
            VALUES (pnDescription);
    END //

CREATE PROCEDURE update_paymentMethod(IN pnId INT, IN pnDescription VARCHAR(45))
    BEGIN
            UPDATE payment_method
            SET description = pnDescription
            WHERE id = pnId;
    END //
    
CREATE PROCEDURE remove_paymentMethod(IN pnId INT)
        BEGIN
            DELETE FROM payment_method
            WHERE id = pnId;
    END//

CREATE FUNCTION getDescription_paymentMethod(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rDescription VARCHAR(45);
        SET rDescription = "";
            SELECT description
            INTO rDescription
            FROM payment_method
            WHERE id = vId;
    RETURN rDescription;
    END //

CREATE PROCEDURE getAll_paymentMethod()
    BEGIN
            SELECT id, description
            FROM payment_method;
    END//

CREATE FUNCTION getId_paymentMethod(vDescription VARCHAR(45)) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rId INT;
        SET rId = 0;
            SELECT id
            INTO rId
            FROM payment_method
            WHERE description = vDescription;
    RETURN rId;
    END //
DELIMITER ;