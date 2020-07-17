-- Connected from PERSON_AD

CREATE TABLE `person_ad`.`district` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `id_city` INT NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_district_city_idx` (`id_city` ASC) VISIBLE,
  CONSTRAINT `fk_district_city`
    FOREIGN KEY (`id_city`)
    REFERENCES `person_ad`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);