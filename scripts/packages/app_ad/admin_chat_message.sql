-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_chat_message;
DROP PROCEDURE IF EXISTS update_chat_message;
DROP PROCEDURE IF EXISTS remove_chat_message;
DROP FUNCTION IF EXISTS getDate_chat_message;
DROP FUNCTION IF EXISTS getMessage_chat_message;
DROP FUNCTION IF EXISTS getUsernameWriter_chat_message;
DROP FUNCTION IF EXISTS getIdChat_chat_message;
DROP PROCEDURE IF EXISTS getAll_chat_message;
DELIMITER //


CREATE PROCEDURE insert_chat_message(IN pnMessage VARCHAR(200), IN pnUsernameWriter VARCHAR(45), IN pnId_chat INT)
    BEGIN
            INSERT INTO chat_message(message, username_writer, id_chat)
            VALUES (pnMessage, pnUsernameWriter, pnId_chat);
    END //

CREATE PROCEDURE update_chat_message(IN pnId INT, IN pnDate DATETIME, IN pnMessage VARCHAR(200), IN pnUsernameWriter VARCHAR(45), IN pnId_chat INT)
    BEGIN
            UPDATE chat_message
            SET
                date = pnDate,
                message = pnMessage,
                username_writer = pnUsernameWriter,
                id_chat = pnId_chat
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_chat_message(IN pnId INT)
        BEGIN
            DELETE FROM chat_message
            WHERE id = pnId;
    END//

CREATE FUNCTION getDate_chat_message(vId INT) 
RETURNS DATETIME
DETERMINISTIC
    BEGIN
        DECLARE rDate DATETIME;
        SET rDate = STR_TO_DATE('0,0,0000','%d,%m,%Y');
            SELECT date
            INTO rDate
            FROM chat_message
            WHERE id = vId;
    RETURN rDate;
    END //

CREATE FUNCTION getMessage_chat_message(vId INT) 
RETURNS VARCHAR(200)
DETERMINISTIC
    BEGIN
        DECLARE rMessage VARCHAR(200);
        SET rMessage = "";
            SELECT message
            INTO rMessage
            FROM chat_message
            WHERE id = vId;
    RETURN rMessage;
    END //

CREATE FUNCTION getUsernameWriter_chat_message(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SET rUsernameWriter = "";
            SELECT message
            INTO rUsernameWriter
            FROM chat_message
            WHERE id = vId;
    RETURN rUsernameWriter;
    END // 

CREATE FUNCTION getIdChat_chat_message(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdChat INT;
        SET rIdChat = 0;
            SELECT id_chat
            INTO rIdChat
            FROM chat_message
            WHERE id = vId;
    RETURN rIdChat;
    END //

CREATE PROCEDURE getAll_chat_message()
    BEGIN
            SELECT id, date, message, username_writer, id_chat
            FROM chat_message;
    END//

DELIMITER ;