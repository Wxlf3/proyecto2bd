-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_paymentMethod;
DROP PROCEDURE IF EXISTS update_paymentMethod;
DROP PROCEDURE IF EXISTS remove_paymentMethod;
DROP PROCEDURE IF EXISTS getDescription_paymentMethod;
DROP PROCEDURE IF EXISTS getAll_paymentMethod;
DROP PROCEDURE IF EXISTS getId_paymentMethod;
DELIMITER //

CREATE PROCEDURE insert_paymentMethod(IN pnDescription VARCHAR(10))
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

CREATE PROCEDURE getDescription_paymentMethod(vId INT)
    BEGIN
        DECLARE rDescription VARCHAR(45);
        SELECT description
        FROM payment_method
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_paymentMethod()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, description
            FROM payment_method;
    END//

CREATE PROCEDURE getId_paymentMethod(vDescription VARCHAR(45))
    BEGIN
    DECLARE rowcount int;
        SELECT id
        FROM payment_method
        WHERE description = vDescription;
    END //
DELIMITER ;