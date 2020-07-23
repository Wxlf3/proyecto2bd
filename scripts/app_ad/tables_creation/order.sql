-- Connected from APP_AD

CREATE TABLE `order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` decimal(10,2) NOT NULL,
  `quantity` int NOT NULL,
  `date` datetime NOT NULL,
  `user_seller` varchar(45) NOT NULL,
  `user_buyer` varchar(45) NOT NULL,
  `id_product` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_order_userSeller_idx` (`user_seller` ASC) VISIBLE,
  INDEX `fk_order_userBuyer_idx` (`user_buyer` ASC) VISIBLE,
  INDEX `fk_order_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_order_product` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_order_userBuyer` FOREIGN KEY (`user_buyer`) REFERENCES `user` (`username`),
  CONSTRAINT `fk_order_userSeller` FOREIGN KEY (`user_seller`) REFERENCES `user` (`username`)
) 