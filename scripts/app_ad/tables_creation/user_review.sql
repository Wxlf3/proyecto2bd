CREATE TABLE `app_ad`.`user_review` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `score` DECIMAL(3) NULL,
  `comment` VARCHAR(100) NULL,
  `type_review` INT NULL,
  `username_writer` VARCHAR(20) NULL,
  `username_receiver` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_userReview_reviewType_idx` (`type_review` ASC) VISIBLE,
  INDEX `fk_userReview_userWriter_idx` (`username_writer` ASC) VISIBLE,
  INDEX `fk_userReview_userReceiver_idx` (`username_receiver` ASC) VISIBLE,
  CONSTRAINT `fk_userReview_reviewType`
    FOREIGN KEY (`type_review`)
    REFERENCES `app_ad`.`review_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_userReview_userWriter`
    FOREIGN KEY (`username_writer`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_userReview_userReceiver`
    FOREIGN KEY (`username_receiver`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
