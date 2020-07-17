-- Connected from PERSON_AD

CREATE TABLE `person_ad`.`state` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `id_country` INT NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_state_country_idx` (`id_country` ASC) VISIBLE,
  CONSTRAINT `fk_state_country`
    FOREIGN KEY (`id_country`)
    REFERENCES `person_ad`.`country` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);