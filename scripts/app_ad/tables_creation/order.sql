CREATE TABLE `app_ad`.`order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(3) NULL,
  `quantity` INT NULL,
  `date` DATETIME NULL,
  `user_seller` VARCHAR(20) NULL,
  `user_buyer` VARCHAR(20) NULL,
  `id_product` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_order_userSeller_idx` (`user_seller` ASC) VISIBLE,
  INDEX `fk_order_userBuyer_idx` (`user_buyer` ASC) VISIBLE,
  INDEX `fk_order_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_order_userSeller`
    FOREIGN KEY (`user_seller`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_userBuyer`
    FOREIGN KEY (`user_buyer`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_product`
    FOREIGN KEY (`id_product`)
    REFERENCES `app_ad`.`product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
