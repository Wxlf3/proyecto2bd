-- Connected from APP_AD

CREATE OR REPLACE PACKAGE admin_chat IS
    PROCEDURE insert_chat(pnId_order NUMBER);
    PROCEDURE update_chat(pnId NUMBER, pnId_order NUMBER);
    PROCEDURE remove_chat(pnId NUMBER);
    FUNCTION getIdOrder(vId NUMBER) RETURN NUMBER;
    FUNCTION getAll RETURN sys_refcursor;
END admin_chat;
/

CREATE OR REPLACE PACKAGE BODY admin_chat AS
    PROCEDURE insert_chat(pnId_order NUMBER) IS
        BEGIN
            INSERT INTO chat(id, id_order)
            VALUES (app.seq_chat.nextval, pnId_order);
        END;

    PROCEDURE update_chat(pnId NUMBER, pnId_order NUMBER) IS
        BEGIN
            UPDATE chat
            SET id_order = pnId_order
            WHERE id = pnId;
        END;

    PROCEDURE remove_chat(pnId NUMBER) IS
        BEGIN
            DELETE FROM chat
            WHERE id = pnIdChat;
        END;

    FUNCTION getIdOrder (vId NUMBER) RETURN NUMBER
        IS rIdOrder NUMBER;
    BEGIN
        SELECT id_order
        INTO rIdOrder
        FROM chat
        WHERE id = vId;
        RETURN rIdOrder;
    END;

    FUNCTION getAll RETURN sys_refcursor
        AS rAll sys_refcursor;
    BEGIN
        OPEN rALL FOR
            SELECT id, name
            FROM category;
        RETURN rAll;
    END;
    
    FUNCTION getId(vId_Order rIdOrder) RETURN NUMBER
    AS
        rid NUMBER;
    BEGIN
        SELECT id
        INTO rid
        FROM chat
        WHERE id_order = vId_Order;
    RETURN rid;
    END;
END admin_chat;

/