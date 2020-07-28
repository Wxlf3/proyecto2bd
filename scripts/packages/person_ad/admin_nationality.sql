-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_nationality`;
DROP procedure IF EXISTS `update_nationality`;
DROP procedure IF EXISTS `remove_nationality`;
DROP function IF EXISTS `getName_nationality`;
DROP procedure IF EXISTS `getAll_nationality`;
DROP function IF EXISTS `getId_nationality`;

DELIMITER $$

CREATE PROCEDURE `insert_nationality` (IN pnName VARCHAR(45))
BEGIN
	INSERT INTO nationality(name)
	VALUES (pnName);
END$$

CREATE PROCEDURE `update_nationality` (IN pnId INT, IN pnName VARCHAR(45))
BEGIN
	UPDATE nationality
	SET name = pnName
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_nationality` (IN pnId INT)
BEGIN
	DELETE FROM nationality
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_nationality` (vId INT)
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM nationality
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_nationality` ()
BEGIN
	SELECT id, name
    FROM nationality;
END$$

CREATE FUNCTION `getId_nationality` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM nationality
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;