CREATE TABLE `app_ad`.`shopping_cart` (
  `username` VARCHAR(20) NOT NULL,
  `id_product` INT NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`username`),
  INDEX `fk_wishList_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_shoppingCart_user`
    FOREIGN KEY (`username`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_shoppingCart_product`
    FOREIGN KEY (`id_product`)
    REFERENCES `app_ad`.`product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
