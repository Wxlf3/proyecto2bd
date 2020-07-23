-- Connected from APP_AD

CREATE OR REPLACE PACKAGE admin_category IS
    PROCEDURE insert_category(pnName VARCHAR2);
    PROCEDURE update_category(pnId NUMBER, pnName VARCHAR2);
    PROCEDURE remove_category(pnIdCategory NUMBER);
    FUNCTION getName(vId NUMBER) RETURN VARCHAR2;
    FUNCTION getAll RETURN sys_refcursor;
    FUNCTION getId(vName VARCHAR2) RETURN NUMBER;
END admin_category;
/

CREATE OR REPLACE PACKAGE BODY admin_category AS
    PROCEDURE insert_category(pnName VARCHAR2) IS
        BEGIN
            INSERT INTO category(name)
            VALUES (pnName);
        END;

    PROCEDURE update_category(pnId NUMBER, pnName VARCHAR2) IS
        BEGIN
            UPDATE category
            SET name = pnName
            WHERE id = pnId;
        END;

    PROCEDURE remove_category(pnIdCategory NUMBER) IS
        BEGIN
            DELETE FROM category
            WHERE id = pnIdCategory;
        END;

    FUNCTION getName (vId NUMBER) RETURN VARCHAR2
        IS rName VARCHAR2(20);
    BEGIN
        SELECT name
        INTO rName
        FROM category
        WHERE id = vId;
        RETURN rName;
    END;

    FUNCTION getAll RETURN sys_refcursor
        AS rAll sys_refcursor;
    BEGIN
        OPEN rALL FOR
            SELECT id, name
            FROM category;
        RETURN rAll;
    END;
    
    FUNCTION getId(vName VARCHAR2) RETURN NUMBER
    AS
        rid NUMBER(4);
    BEGIN
        SELECT id
        INTO rid
        FROM category
        WHERE name = vName;
    RETURN rid;
    END;
END admin_category;

/