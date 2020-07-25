DROP TRIGGER IF EXISTS `app_ad`.`user_review_BEFORE_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`user_review_BEFORE_INSERT` BEFORE INSERT ON `user_review` FOR EACH ROW
BEGIN
	SET NEW.creation_user = current_user();
	SET NEW.creation_date = current_timestamp();
END$$
DELIMITER ;
DROP TRIGGER IF EXISTS `app_ad`.`user_review_BEFORE_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`user_review_BEFORE_UPDATE` BEFORE UPDATE ON `user_review` FOR EACH ROW
BEGIN
	SET NEW.last_change_user = current_user();
    SET NEW.last_change_date = current_timestamp();
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `app_ad`.`user_review_AFTER_INSERT`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`user_review_AFTER_INSERT` AFTER INSERT ON `user_review` FOR EACH ROW
BEGIN
	UPDATE user
    SET average_score_buyer = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = NEW.username_receiver AND id_type_review = 1), 0)
    WHERE username = NEW.username_receiver;
	UPDATE user
    SET average_score_seller = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = NEW.username_receiver AND id_type_review = 2), 0)
    WHERE username = NEW.username_receiver;
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS `app_ad`.`user_review_AFTER_UPDATE`;

DELIMITER $$
USE `app_ad`$$
CREATE DEFINER = CURRENT_USER TRIGGER `app_ad`.`user_review_AFTER_UPDATE` AFTER UPDATE ON `user_review` FOR EACH ROW
BEGIN
	UPDATE user
    SET average_score_buyer = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = NEW.username_receiver AND id_type_review = 1), 0)
    WHERE username = NEW.username_receiver;
	UPDATE user
    SET average_score_seller = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = NEW.username_receiver AND id_type_review = 2), 0)
    WHERE username = NEW.username_receiver;
	UPDATE user
    SET average_score_buyer = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = OLD.username_receiver AND id_type_review = 1), 0)
    WHERE username = OLD.username_receiver;
	UPDATE user
    SET average_score_seller = IFNULL((SELECT AVG(score) FROM user_review WHERE username_receiver = OLD.username_receiver AND id_type_review = 2), 0)
    WHERE username = OLD.username_receiver;
END$$
DELIMITER ;
