DROP TRIGGER IF EXISTS `app_ad`.`product_review_BEFORE_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`product_review_BEFORE_INSERT` BEFORE INSERT ON `product_review` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
	SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `app_ad`.`product_review_BEFORE_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`product_review_BEFORE_UPDATE` BEFORE UPDATE ON `product_review` FOR EACH ROW
BEGIN
	SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `app_ad`.`product_review_AFTER_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`product_review_AFTER_INSERT` AFTER INSERT ON `product_review` FOR EACH ROW
BEGIN
	UPDATE product
    SET average_score = (SELECT AVG(score) FROM product_review WHERE id_product = NEW.id_product)
    WHERE id = NEW.id_product;
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `app_ad`.`product_review_AFTER_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`product_review_AFTER_UPDATE` AFTER UPDATE ON `product_review` FOR EACH ROW
BEGIN
	UPDATE product
    SET average_score = (SELECT AVG(score) FROM product_review WHERE id_product = NEW.id_product)
    WHERE id = NEW.id_product;
	UPDATE product
    SET average_score = (SELECT AVG(score) FROM product_review WHERE id_product = OLD.id_product)
    WHERE id = OLD.id_product;
END$$
DELIMITER ;
