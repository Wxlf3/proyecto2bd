CREATE TABLE `wish_list` (
  `username` varchar(20) NOT NULL,
  `id_product` int DEFAULT NULL,
  `quantity` varchar(45) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `fk_wishList_product_idx` (`id_product`),
  CONSTRAINT `fk_wishList_product` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`),
  CONSTRAINT `fk_wishList_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
)