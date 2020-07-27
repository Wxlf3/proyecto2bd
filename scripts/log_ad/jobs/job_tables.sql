-- Connected from LOG_AD

CREATE TABLE `top_5_sellers_score` (
  `position` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `seller_score` DECIMAL(4,2) NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  PRIMARY KEY (`position`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE
);

CREATE TABLE `top_10_expensive_sales` (
  `position` int NOT NULL AUTO_INCREMENT,
  `order_id` varchar(45) NOT NULL,
  `date` DATETIME NOT NULL,
  `product_name` VARCHAR(45) NOT NULL,
  `final_price` DECIMAL(10,2) NOT NULL,
  `username_seller` VARCHAR(45) NOT NULL,
  `username_buyer` VARCHAR(45) NOT NULL,
  `creation_date` datetime NULL,
  `creation_user` varchar(45) NULL,
  PRIMARY KEY (`position`),
  UNIQUE INDEX `username_UNIQUE` (`order_id` ASC) VISIBLE
);