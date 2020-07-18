CREATE TABLE `app_ad`.`chat_message` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` DATETIME NULL,
  `message` VARCHAR(100) NULL,
  `username_writer` VARCHAR(20) NULL,
  `id_chat` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_chatMessage_user_idx` (`username_writer` ASC) VISIBLE,
  INDEX `fk_chatMessage_chat_idx` (`id_chat` ASC) VISIBLE,
  CONSTRAINT `fk_chatMessage_user`
    FOREIGN KEY (`username_writer`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_chatMessage_chat`
    FOREIGN KEY (`id_chat`)
    REFERENCES `app_ad`.`chat` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
