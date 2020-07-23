-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_user;
DROP PROCEDURE IF EXISTS update_user;
DROP PROCEDURE IF EXISTS remove_user;
DROP PROCEDURE IF EXISTS getPassword_user;
DROP PROCEDURE IF EXISTS getAverageScoreBuyer_user;
DROP PROCEDURE IF EXISTS getAverageScoreSeller_user;
DROP PROCEDURE IF EXISTS getIdUserType_user;
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

CREATE PROCEDURE getPassword_user(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rPassword VARCHAR(30);
        SELECT password
        FROM user
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getAverageScoreBuyer_user(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rAverageScoreBuyer DECIMAL(4,2);
        SELECT average_score_buyer
        FROM user
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getAverageScoreSeller_user(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rAverageScoreSeller DECIMAL(4,2);
        SELECT average_score_seller
        FROM user
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getIdUserType_user(pnUsername VARCHAR(45))
    BEGIN
        DECLARE rIdUserType INT;
        SELECT id_user_type
        FROM user
        WHERE username = pnUsername;
    END//

CREATE PROCEDURE getAll_user()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT username, average_score_buyer, average_score_seller, id_user_type
            FROM user;
    END//
DELIMITER ;