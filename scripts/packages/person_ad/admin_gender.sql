-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_gender`;
DROP procedure IF EXISTS `update_gender`;
DROP procedure IF EXISTS `remove_gender`;
DROP function IF EXISTS `getName_gender`;
DROP procedure IF EXISTS `getAll_gender`;
DROP function IF EXISTS `getId_gender`;

DELIMITER $$

CREATE PROCEDURE `insert_gender` (IN pnName VARCHAR(45))
BEGIN
	INSERT INTO gender(name)
	VALUES (pnName);
END$$

CREATE PROCEDURE `update_gender` (IN pnId INT, IN pnName VARCHAR(45))
BEGIN
	UPDATE gender
	SET name = pnName
	WHERE id = pnId;	
END$$

CREATE PROCEDURE `remove_gender` (IN pnId INT)
BEGIN
	DELETE FROM gender
    WHERE id = pnId;
END$$

CREATE FUNCTION `getName_gender` (vId INT)
RETURNS INTEGER
BEGIN
	DECLARE result VARCHAR(45);
    SELECT name
    INTO result
    FROM gender
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_gender` ()
BEGIN
	SELECT id, name
    FROM gender;
END$$

CREATE FUNCTION `getId_gender` (vName VARCHAR(45))
RETURNS INTEGER
BEGIN
	DECLARE result INT;
    SELECT id
    INTO result
    FROM gender
    WHERE name = vName;
RETURN result;
END$$

DELIMITER ;