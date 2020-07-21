-- Connected from APP_AD

CREATE TABLE `review_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
) 