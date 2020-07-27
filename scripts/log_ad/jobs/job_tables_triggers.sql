-- Connected from LOG_AD

DROP TRIGGER IF EXISTS `log_ad`.`top_10_expensive_sales_BEFORE_INSERT`;

DELIMITER $$
USE `log_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `log_ad`.`top_10_expensive_sales_BEFORE_INSERT` BEFORE INSERT ON `top_10_expensive_sales` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
    SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `log_ad`.`top_5_sellers_score_BEFORE_INSERT`;

DELIMITER $$
USE `log_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `log_ad`.`top_5_sellers_score_BEFORE_INSERT` BEFORE INSERT ON `top_5_sellers_score` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
    SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;