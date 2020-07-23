-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_district`;
DROP procedure IF EXISTS `update_district`;
DROP procedure IF EXISTS `remove_district`;
DROP function IF EXISTS `getName_district`;
DROP function IF EXISTS `getIdCity_district`;
DROP procedure IF EXISTS `getAll_district`;
DROP function IF EXISTS `getId_district`;

DELIMITER $$

CREATE PROCEDURE `insert_district` (IN pnName VARCHAR(45), IN pnIdCity INT)
BEGIN
	INSERT INTO district(name, id_city)
	VALUES (pnName, pnIdCity);
END$$

CREATE PROCEDURE `update_district` (IN pnId INT, IN pnName VARCHAR(45), IN pnIdCity INT)
BEGIN
	UPDATE district
	SET name = pnName, id_city = pnIdCity
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_district` (IN pnId INT)
BEGIN
	DELETE FROM district
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_district` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM district
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getIdCity_district` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id_city
    INTO result
    FROM district
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_district` ()
BEGIN
	SELECT id, name, id_city
    FROM district;
END$$

CREATE FUNCTION `getId_district` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM district
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;