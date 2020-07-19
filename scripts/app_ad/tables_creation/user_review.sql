CREATE TABLE `user_review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` decimal(4,2) NULL,
  `comment` varchar(200) NULL,
  `id_type_review` int NOT NULL,
  `username_writer` varchar(45) NULL,
  `username_receiver` varchar(45) NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  `last_change_date` datetime NULL,
  `last_change_user` varchar(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_userReview_typeReview_idx` (`id_type_review` ASC) VISIBLE,
  INDEX `fk_userReview_userWriter_idx` (`username_writer` ASC) VISIBLE,
  INDEX `fk_userReview_userReceiver_idx` (`username_receiver` ASC) VISIBLE,
  CONSTRAINT `fk_userReview_typeReview` FOREIGN KEY (`id_type_review`) REFERENCES `review_type` (`id`),
  CONSTRAINT `fk_userReview_userReceiver` FOREIGN KEY (`username_receiver`) REFERENCES `user` (`username`),
  CONSTRAINT `fk_userReview_userWriter` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`)
)