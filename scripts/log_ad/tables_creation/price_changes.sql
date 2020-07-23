-- Connected from SYS

GRANT SELECT, REFERENCES ON `app_ad`.`product` TO 'log_ad'@'localhost';

-- Connected from LOG_AD

CREATE TABLE `log_ad`.`price_changes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_product` INT NOT NULL,
  `date` DATETIME NOT NULL,
  `prev_price` DECIMAL(10,2) NULL,
  `current_price` DECIMAL(10,2) NULL,
  `creation_date` DATETIME NULL,
  `creation_user` VARCHAR(45) NULL,
  `last_change_date` DATETIME NULL,
  `last_change_user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_priceChanges_product_idx` (`id_product` ASC) VISIBLE,
  CONSTRAINT `fk_priceChanges_product`
    FOREIGN KEY (`id_product`)
    REFERENCES `app_ad`.`product` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);