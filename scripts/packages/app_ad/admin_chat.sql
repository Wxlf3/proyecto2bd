-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_chat;
DROP PROCEDURE IF EXISTS update_chat;
DROP PROCEDURE IF EXISTS remove_chat;
DROP FUNCTION IF EXISTS getIdOrder_chat;
DROP PROCEDURE IF EXISTS getAll_chat;
DROP FUNCTION IF EXISTS get_idChat_with_idOrder;
DROP FUNCTION IF EXISTS get_idChat_with_idOrder;
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

CREATE FUNCTION getIdOrder_chat(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdOrder INT;
        SET rIdOrder = 0;
            SELECT id_order
            INTO rIdOrder
            FROM chat
            WHERE id = vId;
    RETURN rIdOrder;
    END //

CREATE PROCEDURE getAll_chat()
    BEGIN
            SELECT id, id_order
            FROM chat;
    END//
    
CREATE FUNCTION get_idChat_with_idOrder(vidOrder INT) RETURNS INT
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM chat
    WHERE id_order = vidOrder;
RETURN result;
END//
DELIMITER ;