-- Connected from PERSON_AD

USE `person_ad`;
DROP procedure IF EXISTS `insert_person_x_nationality`;
DROP procedure IF EXISTS `remove_person_x_nationality_with_idPerson`;
DROP procedure IF EXISTS `remove_person_x_nationality_with_idNationality`;
DROP procedure IF EXISTS `remove_person_x_nationality`;
DROP procedure IF EXISTS `get_person_x_nationality_with_idPerson`;
DROP procedure IF EXISTS `get_person_x_nationality_with_idNationality`;
DROP procedure IF EXISTS `getAll_person_x_nationality`;

DELIMITER $$

CREATE PROCEDURE `insert_person_x_nationality` (IN pnIdPerson INT, IN pnIdNationality INT)
BEGIN
	INSERT INTO person_x_nationality(id_person, id_nationality)
	VALUES (pnIdPerson, pnIdNationality);
END$$

CREATE PROCEDURE `remove_person_x_nationality` (IN pnIdPerson INT, IN pnIdNationality INT)
BEGIN
	DELETE FROM person_x_nationality
    WHERE id_person = pnIdPerson AND id_nationality = pnIdNationality;
END$$

CREATE PROCEDURE `remove_person_x_nationality_with_idPerson` (IN pnIdPerson INT)
BEGIN
	DELETE FROM person_x_nationality
    WHERE id_person = pnIdPerson;
END$$

CREATE PROCEDURE `remove_person_x_nationality_with_idNationality` (IN pnIdNationality INT)
BEGIN
	DELETE FROM person_x_nationality
    WHERE id_nationality = pnIdNationality;
END$$

CREATE PROCEDURE `get_person_x_nationality_with_idPerson` (IN pnIdPerson INT)
BEGIN
	SELECT id_person, id_nationality
    FROM person_x_nationality
    WHERE id_person = pnIdPerson;
END$$

CREATE PROCEDURE `get_person_x_nationality_with_idNationality` (IN pnIdNationality INT)
BEGIN
	SELECT id_person, id_nationality
    FROM person_x_nationality
    WHERE id_nationality = pnIdNationality;
END$$

CREATE PROCEDURE `getAll_person_x_nationality` ()
BEGIN
	SELECT id_person, id_nationality
    FROM person_x_nationality;
END$$

DELIMITER ;