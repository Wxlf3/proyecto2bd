DROP TRIGGER IF EXISTS `app_ad`.`product_BEFORE_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`product_BEFORE_INSERT` BEFORE INSERT ON `product` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
	SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;
DROP TRIGGER IF EXISTS `app_ad`.`product_BEFORE_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER=`app_ad`@`localhost` TRIGGER `product_BEFORE_UPDATE` BEFORE UPDATE ON `product` FOR EACH ROW 
BEGIN
    SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
    IF NOT (NEW.price <=> OLD.price) THEN
		INSERT INTO `log_ad`.`price_changes`(id_product, date, prev_price, current_price)
        VALUES (NEW.id, current_timestamp(), OLD.price, NEW.price);
    END IF;
END$$
DELIMITER ;
