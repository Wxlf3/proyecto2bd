-- Connected from PERSON_AD

CREATE TABLE `person_ad`.`city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `id_state` INT NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
  INDEX `fk_city_state_idx` (`id_state` ASC) VISIBLE,
  CONSTRAINT `fk_city_state`
    FOREIGN KEY (`id_state`)
    REFERENCES `person_ad`.`state` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);