-- Connected from PERSON_AD

CREATE TABLE `person_ad`.`person_x_nationality` (
  `id_person` VARCHAR(30) NOT NULL,
  `id_nationality` INT NOT NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id_person`, `id_nationality`),
  INDEX `fk_personxnationality_nationality_idx` (`id_nationality` ASC) VISIBLE,
  CONSTRAINT `fk_personxnationality_person`
    FOREIGN KEY (`id_person`)
    REFERENCES `person_ad`.`person` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_personxnationality_nationality`
    FOREIGN KEY (`id_nationality`)
    REFERENCES `person_ad`.`nationality` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);