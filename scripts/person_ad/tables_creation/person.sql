-- Connected from PERSON_AD

CREATE TABLE `person_ad`.`person` (
  `id` VARCHAR(30) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `phone_number` VARCHAR(20) NOT NULL,
  `birthday` DATE NOT NULL,
  `picture_path` VARCHAR(60) NULL,
  `id_gender` INT NULL,
  `id_district` INT NULL,
  `username` VARCHAR(45) NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_person_gender_idx` (`id_gender` ASC) VISIBLE,
  INDEX `fk_person_district_idx` (`id_district` ASC) VISIBLE,
  CONSTRAINT `fk_person_gender`
    FOREIGN KEY (`id_gender`)
    REFERENCES `person_ad`.`gender` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_district`
    FOREIGN KEY (`id_district`)
    REFERENCES `person_ad`.`district` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);