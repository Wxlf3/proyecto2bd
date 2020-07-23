-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_userXpaymentMethod;
DROP PROCEDURE IF EXISTS remove_userXpaymentMethod;
DROP PROCEDURE IF EXISTS getAll_userXpaymentMethod;
DELIMITER //

CREATE PROCEDURE insert_userXpaymentMethod(IN pnUsername VARCHAR(20), IN pnIdPaymentMethod INT)
    BEGIN
            INSERT INTO user_X_paymentMethod(username, id_payment_method)
            VALUES (pnUsername, pnIdPaymentMethod);
    END //

CREATE PROCEDURE remove_userXpaymentMethod(IN pnUsername VARCHAR(20), IN pnIdPaymentMethod INT)
        BEGIN
            DELETE FROM user_X_paymentMethod
            WHERE username = pnUsername and id_payment_method = pnIdPaymentMethod;
    END//

CREATE PROCEDURE getAll_userXpaymentMethod()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT username, id_payment_method
            FROM user_X_paymentMethod;
    END//
DELIMITER ;