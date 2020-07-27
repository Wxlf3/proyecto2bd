-- Connected from SYS

grant select on `log_ad`.`top_5_sellers_score` to 'app_ad'@'localhost';
grant select on `log_ad`.`top_10_expensive_sales` to 'app_ad'@'localhost';


-- Connected from APP_AD

DROP procedure IF EXISTS `top_sellers`;
DROP procedure IF EXISTS `top_buyers`;
DROP procedure IF EXISTS `best_scores`;
DROP procedure IF EXISTS `worst_scores`;
DROP procedure IF EXISTS `top_expensives_of_category`;
DROP procedure IF EXISTS `max_min_prices_by_category`;
DROP procedure IF EXISTS `job_top_5_sellers`;
DROP procedure IF EXISTS `job_top_10_sales`;

DELIMITER //

CREATE PROCEDURE `top_sellers`(IN rowsq INT)
BEGIN
	IF rowsq < 0 THEN
		SET rowsq = 0;
	END IF;
    
    SELECT p.username_seller `username`, count(p.username_seller) `sales`
    FROM `order` o
    INNER JOIN `product` p ON o.id_product = p.id
    GROUP BY `username`
    ORDER BY `sales` DESC, `username` ASC
    LIMIT rowsq;
END//

CREATE PROCEDURE `top_buyers`(IN rowsq INT)
BEGIN
	IF rowsq < 0 THEN
		SET rowsq = 0;
	END IF;
    
	SELECT user_buyer `username`, count(user_buyer) `purchases`
	FROM `order`
	GROUP BY user_buyer
	ORDER BY `purchases` DESC, username ASC
	LIMIT rowsq;
END//

CREATE PROCEDURE `best_scores`()
BEGIN
	SELECT username `username`, average_score_buyer `score_buyer`, average_score_seller `score_seller`, round((average_score_seller + average_score_buyer)/2, 2) `general_score`
    FROM `user`
    ORDER BY (average_score_seller + average_score_buyer)/2 DESC, `username` ASC;
END//

CREATE PROCEDURE `worst_scores`()
BEGIN
	SELECT username `username`, average_score_buyer `score_buyer`, average_score_seller `score_seller`, round((average_score_seller + average_score_buyer)/2, 2) `general_score`
    FROM `user`
    ORDER BY (average_score_seller + average_score_buyer)/2 ASC, `username` ASC;
END//

CREATE PROCEDURE `top_expensives_of_category`(IN rowsq INT, IN pid_category INT)
BEGIN
	IF rowsq < 0 THEN
		SET rowsq = 0;
	END IF;
    
    SELECT id `product_id`, name `product_name`, price `price`
    FROM product
    WHERE id_category = pid_category
    ORDER BY `price` DESC, `product_name` ASC
    LIMIT rowsq;
END//

CREATE PROCEDURE `max_min_prices_by_category`()
BEGIN
	SELECT c.name `category`, max(p.price) `max_price`, min(p.price) `min_price`
    FROM `product` p
    INNER JOIN `category` c ON p.id_category = c.id
    GROUP BY p.id_category
    ORDER BY p.id_category;
END//

CREATE PROCEDURE `job_top_5_sellers`()
BEGIN
	SELECT position, username, seller_score
    FROM `log_ad`.`top_5_sellers_score`;
END//

CREATE PROCEDURE `job_top_10_sales`()
BEGIN
	SELECT position, order_id, date, product_name, final_price, username_seller, username_buyer
    FROM `log_ad`.`top_10_expensive_sales`;
END//

DELIMITER ;