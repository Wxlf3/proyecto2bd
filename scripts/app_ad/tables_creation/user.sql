CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(18) NOT NULL,
  `average_score_buyer` decimal(3,0) DEFAULT NULL,
  `average_score_seller` decimal(3,0) DEFAULT NULL,
  `user_type` int NOT NULL,
  `id_person` int DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `user_type_idx` (`user_type`),
  CONSTRAINT `fk_user_userType` FOREIGN KEY (`user_type`) REFERENCES `user_type` (`id`)
) 