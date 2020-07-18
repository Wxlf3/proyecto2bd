CREATE TABLE `app_ad`.`chat` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_order` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_chat_order_idx` (`id_order` ASC) VISIBLE,
  CONSTRAINT `fk_chat_order`
    FOREIGN KEY (`id_order`)
    REFERENCES `app_ad`.`order` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
