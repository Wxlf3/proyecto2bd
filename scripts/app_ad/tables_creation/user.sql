-- Connected from APP_AD

CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(30) NOT NULL,
  `average_score_buyer` decimal(4,2) NULL,
  `average_score_seller` decimal(4,2) NULL,
  `id_user_type` int NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`username`),
  INDEX `fk_user_userType_idx` (`id_user_type` ASC) VISIBLE,
  CONSTRAINT `fk_user_userType` FOREIGN KEY (`id_user_type`) REFERENCES `user_type` (`id`)
) 