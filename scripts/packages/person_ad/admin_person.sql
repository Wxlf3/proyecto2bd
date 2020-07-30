-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_person`;
DROP procedure IF EXISTS `update_person`;
DROP procedure IF EXISTS `remove_person`;
DROP function IF EXISTS `getFirstName_person`;
DROP function IF EXISTS `getMiddleName_person`;
DROP function IF EXISTS `getLastName_person`;
DROP function IF EXISTS `getEmail_person`;
DROP function IF EXISTS `getPhoneNumber_person`;
DROP function IF EXISTS `getBirthday_person`;
DROP function IF EXISTS `getPicturePath_person`;
DROP function IF EXISTS `getIdGender_person`;
DROP function IF EXISTS `getIdDistrict_person`;
DROP function IF EXISTS `getUsername_person`;
DROP procedure IF EXISTS `getAll_person`;
DROP procedure IF EXISTS `get_person_with_username`;

DELIMITER $$

CREATE PROCEDURE `insert_person` (
	IN pnId VARCHAR(30), 
	IN pnFirstName VARCHAR(45), 
    IN pnMiddleName VARCHAR(45),
    IN pnLastName VARCHAR(45),
    IN pnEmail VARCHAR(60),
    IN pnPhoneNumber VARCHAR(20),
    IN pnBirthday DATE,
    IN pnPicturePath VARCHAR(60),
    IN pnIdGender INT,
    IN pnIdDistrict INT,
    IN pnUsername VARCHAR(45) )
BEGIN
	INSERT INTO person(id, first_name, middle_name, last_name, email, phone_number, birthday, picture_path, id_gender, id_district, username)
	VALUES (pnId, pnFirstName, pnMiddleName, pnLastName, pnEmail, pnPhoneNumber, pnBirthday, pnPicturePath, pnIdGender, pnIdDistrict, pnUsername);
END$$

CREATE PROCEDURE `update_person` (
	IN pnId VARCHAR(30), 
	IN pnFirstName VARCHAR(45), 
    IN pnMiddleName VARCHAR(45),
    IN pnLastName VARCHAR(45),
    IN pnEmail VARCHAR(60),
    IN pnPhoneNumber VARCHAR(20),
    IN pnBirthday DATE,
    IN pnPicturePath VARCHAR(60),
    IN pnIdGender INT,
    IN pnIdDistrict INT,
    IN pnUsername VARCHAR(45) )
BEGIN
	UPDATE person
	SET first_name = pnFirstName,
		middle_name = pnMiddleName,
		last_name = pnLastName,
        email = pnEmail,
        phone_number = pnPhoneNumber,
        birthday = pnBirthday,
        picture_path = pnPicturePath,
        id_gender = pnIdGender,
        id_district = pnIdDistrict,
        username = pnUsername
	WHERE id = pnId;
END$$

CREATE PROCEDURE `remove_person` (IN pnId VARCHAR(30))
BEGIN
	DELETE FROM person
    WHERE id = pnId;
END$$

CREATE FUNCTION `getFirstName_person` (vId VARCHAR(30))
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SELECT first_name
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getMiddleName_person` (vId VARCHAR(30))
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SET result = "";
    SELECT middle_name
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getLastName_person` (vId VARCHAR(30))
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SELECT last_name
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getEmail_person` (vId VARCHAR(30))
RETURNS VARCHAR(60)
BEGIN
	DECLARE result VARCHAR(60);
    SELECT email
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getPhoneNumber_person` (vId VARCHAR(30))
RETURNS VARCHAR(20)
BEGIN
	DECLARE result VARCHAR(20);
    SELECT phone_number
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getBirthday_person` (vId VARCHAR(30))
RETURNS DATE
BEGIN
	DECLARE result DATE;
    SELECT birthday
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getPicturePath_person` (vId VARCHAR(30))
RETURNS VARCHAR(60)
BEGIN
	DECLARE result VARCHAR(60);
    SET result = "";
    SELECT picture_path
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getIdGender_person` (vId VARCHAR(30))
RETURNS INT
BEGIN
	DECLARE result INT;
    SELECT id_gender
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getIdDistrict_person` (vId VARCHAR(30))
RETURNS INT
BEGIN
	DECLARE result INT;
    SELECT id_district
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE FUNCTION `getUsername_person` (vId VARCHAR(30))
RETURNS VARCHAR(45)
BEGIN
	DECLARE result VARCHAR(45);
    SELECT username
    INTO result
    FROM person
    WHERE id = vId;
RETURN result;
END$$

CREATE PROCEDURE `getAll_person` ()
BEGIN
	SELECT id, first_name, middle_name, last_name, email, phone_number, birthday, picture_path, id_gender, id_district, username
    FROM person;
END$$

CREATE PROCEDURE `get_person_with_username`(IN pnUsername VARCHAR(45))
BEGIN
	SELECT p.id, p.first_name, p.middle_name, p.last_name, p.email, p.phone_number, p.birthday, p.picture_path, g.name `gender`, d.name `district`, ci.name `city`, s.name `state`, co.name `country`, p.username
    FROM `person` p
    INNER JOIN `gender` g ON p.id_gender = g.id
    INNER JOIN `district` d ON p.id_district = d.id
    INNER JOIN `city` ci ON d.id_city = ci.id
    INNER JOIN `state` s ON ci.id_state = s.id
    INNER JOIN `country` co ON s.id_country = co.id
    WHERE username = pnUsername;
END$$

DELIMITER ;