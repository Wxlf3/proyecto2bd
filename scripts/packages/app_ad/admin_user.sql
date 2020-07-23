-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_user;
DROP PROCEDURE IF EXISTS update_user;
DROP PROCEDURE IF EXISTS remove_user;
DROP FUNCTION IF EXISTS getPassword_user;
DROP FUNCTION IF EXISTS getAverageScoreBuyer_user;
DROP FUNCTION IF EXISTS getAverageScoreSeller_user;
DROP FUNCTION IF EXISTS getIdUserType_user;
DROP PROCEDURE IF EXISTS getAll_user;
DELIMITER //

CREATE PROCEDURE insert_user(IN pnUsername VARCHAR(45), IN pnPassword VARCHAR(30), IN pnAverageScoreBuyer DECIMAL(4,2), IN pnAverageScoreSeller DECIMAL(4,2), IN pnIdUserType INT)
    BEGIN
            INSERT INTO user(username, password, average_score_buyer, average_score_seller, id_user_type)
            VALUES (pnUsername, pnPassword, pnAverageScoreBuyer, pnAverageScoreSeller, pnIdUserType);
    END //

CREATE PROCEDURE update_user(IN pnUsername VARCHAR(45), IN pnPassword VARCHAR(30), IN pnAverageScoreBuyer DECIMAL(4,2), IN pnAverageScoreSeller DECIMAL(4,2), IN pnIdUserType INT)
    BEGIN
            UPDATE user
            SET 
            password = pnPassword,
            average_score_seller = pnAverageScoreSeller,
            average_score_buyer = pnAverageScoreBuyer,
            id_user_type = pnIdUserType
            WHERE username = pnUsername;
    END //

CREATE PROCEDURE remove_user(IN pnUsername VARCHAR(45))
        BEGIN
            DELETE FROM user
            WHERE username = pnUsername;
    END//

CREATE FUNCTION getPassword_user(pnUsername VARCHAR(45))
RETURNS VARCHAR(30)
DETERMINISTIC
    BEGIN
        DECLARE rPassword VARCHAR(30);
        SET rPassword = "";
            SELECT password
            INTO rPassword
            FROM user
            WHERE username = pnUsername;
    RETURN rPassword;
    END //

CREATE FUNCTION getAverageScoreBuyer_user(pnUsername VARCHAR(45))
RETURNS DECIMAL(4,2)
DETERMINISTIC
    BEGIN
        DECLARE rAverageScoreBuyer DECIMAL(4,2);
        SET rAverageScoreBuyer = 0;
            SELECT average_score_buyer
            INTO rAverageScoreBuyer
            FROM user
            WHERE username = pnUsername;
    RETURN rAverageScoreBuyer;
    END //

CREATE FUNCTION getAverageScoreSeller_user(pnUsername VARCHAR(45))
RETURNS DECIMAL(4,2)
DETERMINISTIC
    BEGIN
        DECLARE rAverageScoreSeller DECIMAL(4,2);
        SET rAverageScoreSeller = 0;
            SELECT average_score_seller
            INTO rAverageScoreSeller
            FROM user
            WHERE username = pnUsername;
    RETURN rAverageScoreSeller;
    END //

CREATE FUNCTION getIdUserType_user(pnUsername VARCHAR(45))
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdUserType INT;
        SET rIdUserType = 0;
            SELECT id_user_type
            INTO rIdUserType
            FROM user
            WHERE username = pnUsername;
    RETURN rIdUserType;
    END //

CREATE PROCEDURE getAll_user()
    BEGIN
            SELECT username, average_score_buyer, average_score_seller, id_user_type
            FROM user;
    END//
DELIMITER ;