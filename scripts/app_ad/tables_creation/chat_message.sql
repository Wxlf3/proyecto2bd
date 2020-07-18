CREATE TABLE `chat_message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  `username_writer` varchar(20) DEFAULT NULL,
  `id_chat` int DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_chatMessage_user_idx` (`username_writer`),
  KEY `fk_chatMessage_chat_idx` (`id_chat`),
  CONSTRAINT `fk_chatMessage_chat` FOREIGN KEY (`id_chat`) REFERENCES `chat` (`id`),
  CONSTRAINT `fk_chatMessage_user` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`)
) 