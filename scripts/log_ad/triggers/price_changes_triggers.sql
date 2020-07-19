-- Connected from LOG_AD

DROP TRIGGER IF EXISTS `log_ad`.`price_changes_BEFORE_INSERT`;

DELIMITER $$
USE `log_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `log_ad`.`price_changes_BEFORE_INSERT` BEFORE INSERT ON `price_changes` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
    SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `log_ad`.`price_changes_BEFORE_UPDATE`;

DELIMITER $$
USE `log_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `log_ad`.`price_changes_BEFORE_UPDATE` BEFORE UPDATE ON `price_changes` FOR EACH ROW
BEGIN
	SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
END$$
DELIMITER ;
