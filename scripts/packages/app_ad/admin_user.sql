-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_user;
DROP PROCEDURE IF EXISTS update_user;
DROP PROCEDURE IF EXISTS remove_user;
DROP FUNCTION IF EXISTS getPassword_user;
DROP FUNCTION IF EXISTS getAverageScoreBuyer_user;
DROP FUNCTION IF EXISTS getAverageScoreSeller_user;
DROP FUNCTION IF EXISTS getIdUserType_user;
DROP PROCEDURE IF EXISTS getAll_user;
DROP FUNCTION IF EXISTS check_login;
DROP PROCEDURE IF EXISTS get_user_with_username;
DELIMITER //

CREATE PROCEDURE insert_user(IN pnUsername VARCHAR(45), IN pnPassword VARCHAR(30), IN pnIdUserType INT)
    BEGIN
            INSERT INTO user(username, password, average_score_buyer, average_score_seller, id_user_type)
            VALUES (pnUsername, aes_encrypt(pnPassword, pnPassword), 0, 0, pnIdUserType);
    END //

CREATE PROCEDURE update_user(IN pnUsername VARCHAR(45), IN pnPassword VARCHAR(30), IN pnIdUserType INT)
    BEGIN
            UPDATE user
            SET 
            password = aes_encrypt(pnPassword, pnPassword),
            id_user_type = pnIdUserType
            WHERE username = pnUsername;
    END //

CREATE PROCEDURE remove_user(IN pnUsername VARCHAR(45))
        BEGIN
            DELETE FROM user
            WHERE username = pnUsername;
    END//

CREATE FUNCTION getPassword_user(pnUsername VARCHAR(45))
RETURNS VARBINARY(128)
DETERMINISTIC
    BEGIN
        DECLARE rPassword VARBINARY(128);
        SET rPassword = null;
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
    
CREATE FUNCTION check_login(vUsername VARCHAR(45), vPassword VARCHAR(30))
RETURNS BOOL
DETERMINISTIC
	BEGIN
		DECLARE result BOOL;
        SET result = 0;
        IF (aes_encrypt(vPassword, vPassword) <=> (SELECT password FROM user WHERE username = vUsername)) THEN
			SET result = 1;
		END IF;
	RETURN result;
    END//
    
CREATE PROCEDURE get_user_with_username(IN pnUsername VARCHAR(45))
BEGIN
	SELECT u.username, u.average_score_buyer, u.average_score_seller, t.name
    FROM `user` u
    INNER JOIN `user_type` t ON t.id = u.id_user_type
    WHERE u.username = pnUsername;
END//
		
DELIMITER ;