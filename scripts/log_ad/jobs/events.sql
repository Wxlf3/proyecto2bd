-- Connected from SYS

grant SELECT on `app_ad`.`user` to 'log_ad'@'localhost';
grant SELECT on `app_ad`.`product` to 'log_ad'@'localhost';
grant SELECT on `app_ad`.`order` to 'log_ad'@'localhost';
set global event_scheduler = ON;

-- Connected from LOG_AD

DROP EVENT IF EXISTS top_5_sellers_score_job;
DROP EVENT IF EXISTS top_10_expensive_sales_job;

delimiter //

CREATE EVENT top_5_sellers_score_job
    ON SCHEDULE 
	EVERY 1 DAY STARTS '2020-07-27 00:00:00'
	DO 
		BEGIN
			DELETE FROM `top_5_sellers_score`;
			ALTER TABLE `top_5_sellers_score` AUTO_INCREMENT = 1;
			INSERT INTO `top_5_sellers_score`(username, seller_score)
			SELECT username, average_score_seller `seller_score`
			FROM `app_ad`.`user`
			ORDER BY `seller_score` DESC
			LIMIT 5;
		END//

CREATE EVENT top_10_expensive_sales_job
	ON SCHEDULE 
	EVERY 1 DAY STARTS '2020-07-27 00:00:00'
	DO 
		BEGIN
			DELETE FROM `top_10_expensive_sales`;
			ALTER TABLE `top_10_expensive_sales` AUTO_INCREMENT = 1;
            INSERT INTO `top_10_expensive_sales`(order_id, date, product_name, final_price, username_seller, username_buyer)
			SELECT o.id, o.date, p.name, o.price*o.quantity `final_price`, p.username_seller, o.user_buyer
			FROM `app_ad`.`order` o
            INNER JOIN `app_ad`.`product` p ON o.id_product = p.id
            WHERE o.date BETWEEN subdate(current_timestamp(), 1) AND current_timestamp()
			ORDER BY `final_price` DESC
			LIMIT 10;
		END//
delimiter ;