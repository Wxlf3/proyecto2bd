-- Connected from SYS

grant select on `person_ad`.`person` to 'app_ad'@'local_host';
grant select on `person_ad`.`gender` to 'app_ad'@'local_host';

-- Connected from APP_AD

DROP procedure IF EXISTS `products_by_category`;
DROP procedure IF EXISTS `gender_age_range_sellers`;
DROP procedure IF EXISTS `sales_by_gender`;

DELIMITER //

CREATE PROCEDURE `products_by_category`()
BEGIN
	SELECT c.name `category`, count(*) `total_products`, ROUND((COUNT(p.id) / (SELECT COUNT(*) FROM `product`)), 2) * 100 `percentage`
	FROM `product` p
	INNER JOIN `category` c ON p.id_category = c.id
	GROUP BY `category`
	ORDER BY `total_products` DESC, `category` ASC;
END//

CREATE PROCEDURE `gender_age_range_sellers`(IN vid_gender INT)
-- vid_gender = 0 for all genders
BEGIN
	IF vid_gender = 0 THEN
		SET vid_gender = null;
	END IF;
    
    SELECT t.`age_range`, 
		   t.`gender`, 
           t.`quantity` `users`, 
           ROUND(t.`quantity` / (
			SELECT COUNT(*) 
			FROM `app_ad`.`user` u
            INNER JOIN `person_ad`.`person` p ON p.username = u.username
            WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND p.id_gender = IFNULL(vid_gender, p.id_gender)
		   ), 2) * 100 `percentage`
    FROM (
		SELECT '0-18' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) between 0 and 18 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
        UNION ALL
		SELECT '19-30' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) between 19 and 30 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
        UNION ALL
		SELECT '31-40' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) between 31 and 40 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
        UNION ALL
		SELECT '41-50' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) between 41 and 50 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
        UNION ALL
		SELECT '51-60' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) between 51 and 60 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
        UNION ALL
		SELECT '61+' `age_range`, g.name `gender` , sum(case when TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) >= 61 then 1 else 0 end) `quantity`
		FROM `person_ad`.`person` p
		INNER JOIN  `person_ad`.`gender` g ON g.id = p.id_gender
		INNER JOIN `app_ad`.`user` u ON p.username = u.username
		WHERE u.username IN (SELECT username_seller FROM `app_ad`.`product`) AND g.id = IFNULL(vid_gender, g.id)
		GROUP BY g.name
		) t
        GROUP BY `age_range`, `gender`
        ORDER BY `age_range`, `gender`;
END//

CREATE PROCEDURE `sales_by_gender`()
BEGIN
	SELECT g.name `gender`, COUNT(o.id) `sales`, ROUND(COUNT(o.id) / (SELECT COUNT(*) FROM `app_ad`.`order`) * 100, 2) `percentage`
    FROM `person_ad`.`person` pe
    INNER JOIN `person_ad`.`gender` g ON g.id = pe.id_gender
    INNER JOIN `app_ad`.`user` u ON pe.username = u.username
    INNER JOIN `app_ad`.`product` pr ON u.username = pr.username_seller
    INNER JOIN `app_ad`.`order` o ON o.id_product = pr.id
    GROUP BY `gender`
    ORDER BY `sales` DESC, g.id ASC;
END//

DELIMITER ;