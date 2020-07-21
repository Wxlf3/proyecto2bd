DROP TRIGGER IF EXISTS `app_ad`.`shopping_cart_BEFORE_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`shopping_cart_BEFORE_INSERT` BEFORE INSERT ON `shopping_cart` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
	SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;
DROP TRIGGER IF EXISTS `app_ad`.`shopping_cart_BEFORE_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`shopping_cart_BEFORE_UPDATE` BEFORE UPDATE ON `shopping_cart` FOR EACH ROW
BEGIN
	SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
END$$
DELIMITER ;
