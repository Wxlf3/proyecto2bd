DROP EVENT IF EXISTS top_5_sellers;
DROP EVENT IF EXISTS top_10_sells;


delimiter |

CREATE EVENT top_5_sellers
    ON SCHEDULE 
	EVERY 1 DAY STARTS '2020-07-25 00:00:00'
	DO 
	BEGIN
		SELECT username, average_score_seller as average
		FROM user
		ORDER BY average DESC
		LIMIT 5;
      END |

CREATE EVENT top_10_sells
	ON SCHEDULE 
	EVERY 1 DAY STARTS '2020-07-25 00:00:00'
	DO 
		BEGIN
			SELECT id, price
			FROM `order`
			ORDER BY price DESC
			LIMIT 10;
		END |
delimiter ;