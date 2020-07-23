-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_city`;
DROP procedure IF EXISTS `update_city`;
DROP procedure IF EXISTS `remove_city`;
DROP function IF EXISTS `getName_city`;
DROP function IF EXISTS `getIdState_city`;
DROP procedure IF EXISTS `getAll_city`;
DROP function IF EXISTS `getId_city`;

DELIMITER $$

CREATE PROCEDURE `insert_city` (IN pnName VARCHAR(45), IN pnIdState INT)
BEGIN
	INSERT INTO city(name, id_state)
	VALUES (pnName, pnIdState);
END$$

CREATE PROCEDURE `update_city` (IN pnId INT, IN pnName VARCHAR(45), IN pnIdState INT)
BEGIN
	UPDATE city
	SET name = pnName, id_state = pnIdState
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_city` (IN pnId INT)
BEGIN
	DELETE FROM city
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_city` (vId INT)
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM city
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getIdState_city` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id_state
    INTO result
    FROM city
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_city` ()
BEGIN
	SELECT id, name, id_state
    FROM city;
END$$

CREATE FUNCTION `getId_city` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM city
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;