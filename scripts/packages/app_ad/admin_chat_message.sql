-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_chat_message;
DROP PROCEDURE IF EXISTS update_chat_message;
DROP PROCEDURE IF EXISTS remove_chat_message;
DROP PROCEDURE IF EXISTS getDate_chat_message;
DROP PROCEDURE IF EXISTS getMessage_chat_message;
DROP PROCEDURE IF EXISTS getUsernameWriter_chat_message;
DROP PROCEDURE IF EXISTS getMessage_chat_message;
DROP PROCEDURE IF EXISTS getIdChat_chat_message;
DROP PROCEDURE IF EXISTS getAll_chat_message;
DELIMITER //


CREATE PROCEDURE insert_chat_message(IN pnDate DATETIME, IN pnMessage VARCHAR(200), IN pnUsernameWriter VARCHAR(45), IN pnId_chat INT)
    BEGIN
            INSERT INTO chat_message(date, message, username_writer, id_chat)
            VALUES (pnDate, pnMessage, pnUsernameWriter, pnId_chat);
    END //

CREATE PROCEDURE update_chat_message(IN pnId INT, IN pnDate DATETIME, IN pnMessage VARCHAR(200), IN pnUsernameWriter VARCHAR(45), IN pnId_chat INT)
    BEGIN
            UPDATE chat_message
            SET
                id = pnId,
                date = pnDate,
                message = pnMessage,
                id_chat = pnId_chat
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_chat_message(IN pnId INT)
        BEGIN
            DELETE FROM chat_message
            WHERE id = pnId;
    END//

CREATE PROCEDURE getDate_chat_message(vId INT)
    BEGIN
        DECLARE rDate DATETIME;
        SELECT date
        FROM chat_message
        WHERE id = vId;
    END//    

CREATE PROCEDURE getMessage_chat_message(vId INT)
    BEGIN
        DECLARE rMessage VARCHAR(200);
        SELECT message
        FROM chat_message
        WHERE id = vId;
    END//  

CREATE PROCEDURE getUsernameWriter_chat_message(vId INT)
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SELECT username_writer
        FROM chat_message
        WHERE id = vId;
    END//  

CREATE PROCEDURE getIdChat_chat_message(vId INT)
    BEGIN
        DECLARE id_chat int;
        SELECT id_chat
        FROM chat_message
        WHERE id = vId;
    END//  

CREATE PROCEDURE getAll_chat_message()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, date, message, username_writer, id_chat
            FROM chat_message;
    END//

DELIMITER ;