-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_country`;
DROP procedure IF EXISTS `update_country`;
DROP procedure IF EXISTS `remove_country`;
DROP function IF EXISTS `getName_country`;
DROP procedure IF EXISTS `getAll_country`;
DROP function IF EXISTS `getId_country`;

DELIMITER $$

CREATE PROCEDURE `insert_country` (IN pnName VARCHAR(45))
BEGIN
	INSERT INTO country(name)
	VALUES (pnName);
END$$

CREATE PROCEDURE `update_country` (IN pnId INT, IN pnName VARCHAR(45))
BEGIN
	UPDATE country
	SET name = pnName
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_country` (IN pnId INT)
BEGIN
	DELETE FROM country
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_country` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM country
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_country` ()
BEGIN
	SELECT id, name
    FROM country;
END$$

CREATE FUNCTION `getId_country` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM country
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;