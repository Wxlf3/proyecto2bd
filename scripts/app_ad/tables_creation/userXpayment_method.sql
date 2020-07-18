CREATE TABLE `user_X_paymentMethod` (
  `username` varchar(20) NOT NULL,
  `id_payment_method` int NOT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`,`id_payment_method`),
  KEY `fk_UserXPaymentMethod_paymentMethod_idx` (`id_payment_method`),
  CONSTRAINT `fk_UserXPaymentMethod_paymentMethod` FOREIGN KEY (`id_payment_method`) REFERENCES `payment_method` (`id`),
  CONSTRAINT `fk_UserXPaymentMethod_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) 