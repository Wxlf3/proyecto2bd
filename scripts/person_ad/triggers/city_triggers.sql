-- Connected from PERSON_AD

DROP TRIGGER IF EXISTS `person_ad`.`city_BEFORE_INSERT`;

DELIMITER $$
USE `person_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `person_ad`.`city_BEFORE_INSERT` BEFORE INSERT ON `city` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
    SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `person_ad`.`city_BEFORE_UPDATE`;

DELIMITER $$
USE `person_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `person_ad`.`city_BEFORE_UPDATE` BEFORE UPDATE ON `city` FOR EACH ROW
BEGIN
	SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
END$$
DELIMITER ;