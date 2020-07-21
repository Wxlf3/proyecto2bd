-- Connected from APP_AD

CREATE TABLE `chat_message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime NULL,
  `message` varchar(200) NULL,
  `username_writer` varchar(45) NULL,
  `id_chat` int NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_chatMessage_user_idx` (`username_writer` ASC) VISIBLE,
  INDEX `fk_chatMessage_chat_idx` (`id_chat` ASC) VISIBLE,
  CONSTRAINT `fk_chatMessage_chat` FOREIGN KEY (`id_chat`) REFERENCES `chat` (`id`),
  CONSTRAINT `fk_chatMessage_user` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`)
) 