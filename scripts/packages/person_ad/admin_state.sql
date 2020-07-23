-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_state`;
DROP procedure IF EXISTS `update_state`;
DROP procedure IF EXISTS `remove_state`;
DROP function IF EXISTS `getName_state`;
DROP function IF EXISTS `getIdCountry_state`;
DROP procedure IF EXISTS `getAll_state`;
DROP function IF EXISTS `getId_state`;

DELIMITER $$

CREATE PROCEDURE `insert_state` (IN pnName VARCHAR(45), IN pnIdCountry INT)
BEGIN
	INSERT INTO state(name, id_country)
	VALUES (pnName, pnIdCountry);
END$$

CREATE PROCEDURE `update_state` (IN pnId INT, IN pnName VARCHAR(45), IN pnIdCountry INT)
BEGIN
	UPDATE state
	SET name = pnName, id_country = pnIdCountry
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_state` (IN pnId INT)
BEGIN
	DELETE FROM state
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_state` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM state
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getIdCountry_state` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id_country
    INTO result
    FROM state
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_state` ()
BEGIN
	SELECT id, name, id_country
    FROM state;
END$$

CREATE FUNCTION `getId_state` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM state
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;