-- Connected from APP_AD

CREATE TABLE `user_X_paymentMethod` (
  `username` varchar(20) NOT NULL,
  `id_payment_method` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`username`,`id_payment_method`),
  INDEX `fk_UserXPaymentMethod_paymentMethod_idx` (`id_payment_method`),
  CONSTRAINT `fk_UserXPaymentMethod_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`),
  CONSTRAINT `fk_UserXPaymentMethod_paymentMethod` FOREIGN KEY (`id_payment_method`) REFERENCES `payment_method` (`id`)
) 