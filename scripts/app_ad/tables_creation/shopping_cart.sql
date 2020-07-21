-- Connected from APP_AD

CREATE TABLE `shopping_cart` (
  `username` varchar(45) NOT NULL,
  `id_product` int NOT NULL,
  `quantity` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`username`, `id_product`),
  INDEX `fk_shoppingCart_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_shoppingCart_product` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_shoppingCart_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
)