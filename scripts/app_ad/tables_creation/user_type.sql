CREATE TABLE `user_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) 