CREATE TABLE `picture` (
  `id` int NOT NULL AUTO_INCREMENT,
  `path` varchar(60) NOT NULL,
  `id_product` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `path_UNIQUE` (`path` ASC) VISIBLE,
  INDEX `fk_picture_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_picture_product` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`)
)