CREATE TABLE `user_review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `score` decimal(3,0) DEFAULT NULL,
  `comment` varchar(100) DEFAULT NULL,
  `type_review` int DEFAULT NULL,
  `username_writer` varchar(20) DEFAULT NULL,
  `username_receiver` varchar(45) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `creation_user` varchar(45) DEFAULT NULL,
  `last_change_date` datetime DEFAULT NULL,
  `last_change_user` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_userReview_reviewType_idx` (`type_review`),
  KEY `fk_userReview_userWriter_idx` (`username_writer`),
  KEY `fk_userReview_userReceiver_idx` (`username_receiver`),
  CONSTRAINT `fk_userReview_reviewType` FOREIGN KEY (`type_review`) REFERENCES `review_type` (`id`),
  CONSTRAINT `fk_userReview_userReceiver` FOREIGN KEY (`username_receiver`) REFERENCES `user` (`username`),
  CONSTRAINT `fk_userReview_userWriter` FOREIGN KEY (`username_writer`) REFERENCES `user` (`username`)
)