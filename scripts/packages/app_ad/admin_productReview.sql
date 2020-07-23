-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_productReview;
DROP PROCEDURE IF EXISTS update_productReview;
DROP PROCEDURE IF EXISTS remove_productReview;
DROP PROCEDURE IF EXISTS getScore_productReview;
DROP PROCEDURE IF EXISTS getComment_productReview;
DROP PROCEDURE IF EXISTS getUsernameWriter_productReview;
DROP PROCEDURE IF EXISTS getAll_productReview;
DELIMITER //

CREATE PROCEDURE insert_productReview(IN pnScore DECIMAL(4,2), IN pnComment VARCHAR(45), IN pnUsernameWriter VARCHAR(45))
    BEGIN
            INSERT INTO product_review(score, comment, username_writer)
            VALUES (pnScore, pnComment, pnUsernameWriter);
    END //

CREATE PROCEDURE update_productReview(IN pnId INT, IN pnScore DECIMAL(4,2), IN pnComment VARCHAR(45), IN pnUsernameWriter VARCHAR(45))
    BEGIN
            UPDATE product_review
            SET 
            score = pnScore,
            comment = pnComment,
            username_writer = pnUsernameWriter
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_productReview(IN pnId INT)
        BEGIN
            DELETE FROM category
            WHERE id = pnId;
    END//

CREATE PROCEDURE getScore_productReview(vId INT)
    BEGIN
        DECLARE rScore DECIMAL(4,2);
        SELECT score
        FROM product_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getComment_productReview(vId INT)
    BEGIN
        DECLARE rComment VARCHAR(45);
        SELECT comment
        FROM product_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getUsernameWriter_productReview(vId INT)
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SELECT username_writer
        FROM product_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getAll_productReview()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, score, comment, username_writer
            FROM product_review;
    END//
DELIMITER ;