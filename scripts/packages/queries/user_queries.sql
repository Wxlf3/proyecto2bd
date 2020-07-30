-- Connected from APP_AD

DROP procedure IF EXISTS `search_product`;
DROP procedure IF EXISTS `purchase_history`;
DROP procedure IF EXISTS `selling_history`;
DROP procedure IF EXISTS `purchases_quantity_over_1000_by_category`;

DELIMITER //

CREATE PROCEDURE `search_product`(IN search_text VARCHAR(45), IN pid_category INT)
-- id_category = 0 for all categories
BEGIN
	IF pid_category = 0 THEN
		SET pid_category = NULL;
	END IF;
    
    SELECT p.id, p.price, p.name, p.description, c.name `category`
    FROM `product` p
    INNER JOIN `category` c ON p.id_category = c.id
	WHERE p.name LIKE CONCAT('%',search_text,'%') AND p.id_category = IFNULL(pid_category, p.id_category);
END//

CREATE PROCEDURE `purchase_history`(IN pusername VARCHAR(45), IN months INT)
BEGIN
	DECLARE vdate DATETIME;
    IF months = 0 THEN
		SET vdate = null;
	ELSE 
		SET vdate = DATE_SUB(current_timestamp(), INTERVAL months MONTH);
	END IF;
    
    SELECT o.date, p.id `product_id`, p.name `product_name`, o.quantity, o.price `price_by_unit`,  o.price*o.quantity `final_price`, p.username_seller
    FROM `order` o
    INNER JOIN `product` p ON p.id = o.id_product
    WHERE o.user_buyer = pusername AND o.date BETWEEN ifnull(vdate, o.date) AND current_timestamp()
    ORDER BY o.date DESC;
END //

CREATE PROCEDURE `selling_history`(IN pusername VARCHAR(45))
BEGIN
	SELECT o.date, p.id `product_id`, p.name `product_name`, o.quantity, o.price `price_by_unit`,  o.price*o.quantity `final_price`, o.user_buyer
    FROM `order` o
    INNER JOIN `product` p ON p.id = o.id_product
    WHERE p.username_seller = pusername
    ORDER BY o.date DESC;
END//

CREATE PROCEDURE `purchases_quantity_over_1000_by_category`(IN pusername VARCHAR(45))
BEGIN
	SELECT c.name `category`, count(o.id) `purchases_over_1000`
    FROM `product` p
    INNER JOIN `category` c ON p.id_category = c.id
    INNER JOIN `order` o ON p.id = o.id_product
    WHERE o.price*o.quantity >= 1000 AND o.user_buyer = pusername
    GROUP BY `category`
    ORDER BY `category`;
END //

DELIMITER ;