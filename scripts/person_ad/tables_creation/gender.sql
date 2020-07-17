CREATE TABLE `person_ad`.`gender` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));