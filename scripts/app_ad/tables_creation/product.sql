-- Connected from APP_AD

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `price` decimal(10,2) NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(150) NULL,
  `quant_in_stock` int NOT NULL,
  `is_visible` tinyint NOT NULL,
  `average_score` decimal(4,2) NULL,
  `id_category` int NOT NULL,
  `username_seller` varchar(45) NOT NULL,
  `id_delivery_type` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_product_category_idx` (`id_category` ASC) VISIBLE,
  INDEX `fk_product_user_idx` (`username_seller` ASC) VISIBLE,
  INDEX `fk_product_deliveryType_idx` (`id_delivery_type` ASC) VISIBLE,
  CONSTRAINT `fk_product_category` FOREIGN KEY (`id_category`) REFERENCES `category` (`id`),
  CONSTRAINT `fk_product_deliveryType` FOREIGN KEY (`id_delivery_type`) REFERENCES `delivery_type` (`id`),
  CONSTRAINT `fk_product_user` FOREIGN KEY (`username_seller`) REFERENCES `user` (`username`)
)