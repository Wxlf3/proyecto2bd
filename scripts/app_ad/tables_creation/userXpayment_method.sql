CREATE TABLE `app_ad`.`user_X_paymentMethod` (
  `username` VARCHAR(20) NOT NULL,
  `id_payment_method` INT NOT NULL,
  PRIMARY KEY (`username`, `id_payment_method`),
  INDEX `fk_UserXPaymentMethod_paymentMethod_idx` (`id_payment_method` ASC) VISIBLE,
  CONSTRAINT `fk_UserXPaymentMethod_user`
    FOREIGN KEY (`username`)
    REFERENCES `app_ad`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserXPaymentMethod_paymentMethod`
    FOREIGN KEY (`id_payment_method`)
    REFERENCES `app_ad`.`payment_method` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
