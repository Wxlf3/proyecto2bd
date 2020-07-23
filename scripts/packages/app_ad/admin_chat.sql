-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_chat;
DROP PROCEDURE IF EXISTS update_chat;
DROP PROCEDURE IF EXISTS remove_chat;
DROP PROCEDURE IF EXISTS getIdOrder_chat;
DROP PROCEDURE IF EXISTS getAll_chat;
DROP PROCEDURE IF EXISTS getId_chat;
DELIMITER //


CREATE PROCEDURE insert_chat(IN pnId_order INT)
    BEGIN
            INSERT INTO chat(id_order)
            VALUES (pnId_order);
    END //

CREATE PROCEDURE update_chat(IN pnId INT, IN pnId_order INT)
    BEGIN
            UPDATE chat
            SET id_order = pnId_order
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_chat(IN pnId INT)
        BEGIN
            DELETE FROM chat
            WHERE id = pnIdChat;
    END//

CREATE PROCEDURE getIdOrder_chat (vId INT)
    BEGIN
        DECLARE rIdOrder int;
        SELECT id_order
        FROM chat
        WHERE id = vId;
    END//    

CREATE PROCEDURE getAll_chat()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, name
            FROM chat;
    END//

CREATE PROCEDURE getId_chat(vId_Order int)
    BEGIN
    DECLARE ROWCOUNT int;
        SELECT id
        FROM chat
        WHERE id_order = vId_Order;
    END //
DELIMITER ;