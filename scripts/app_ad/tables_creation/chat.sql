CREATE TABLE `chat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_order` int DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_order_UNIQUE` (`id_order`),
  KEY `fk_chat_order_idx` (`id_order`),
  CONSTRAINT `fk_chat_order` FOREIGN KEY (`id_order`) REFERENCES `order` (`id`)
)