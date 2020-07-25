-- Connected from APP_AD

CREATE TABLE `product_review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` decimal(4,2) NULL,
  `comment` varchar(45) NULL,
  `username_writer` varchar(45) NOT NULL,
  `id_product` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_productReview_user_idx` (`username_writer` ASC) VISIBLE,
  INDEX `fk_productReview_idProduct_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_productReview_user` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`),
  CONSTRAINT `fk_productReview_idProduct` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`)
)