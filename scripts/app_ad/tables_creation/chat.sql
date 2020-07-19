CREATE TABLE `chat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_order` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_chat_order_idx` (`id_order` ASC) VISIBLE,
  CONSTRAINT `fk_chat_order` FOREIGN KEY (`id_order`) REFERENCES `order` (`id`)
)