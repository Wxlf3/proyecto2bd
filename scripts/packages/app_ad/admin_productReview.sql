-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_productReview;
DROP PROCEDURE IF EXISTS update_productReview;
DROP PROCEDURE IF EXISTS remove_productReview;
DROP FUNCTION IF EXISTS getScore_productReview;
DROP FUNCTION IF EXISTS getComment_productReview;
DROP FUNCTION IF EXISTS getUsernameWriter_productReview;
DROP FUNCTION IF EXISTS getIdProduct_productReview;
DROP PROCEDURE IF EXISTS getAll_productReview;
DELIMITER //

CREATE PROCEDURE insert_productReview(IN pnScore DECIMAL(4,2), IN pnComment VARCHAR(45), IN pnUsernameWriter VARCHAR(45), IN pnIdProduct INT)
    BEGIN
            INSERT INTO product_review(score, comment, username_writer, id_product)
            VALUES (pnScore, pnComment, pnUsernameWriter, pnIdProduct);
    END //

CREATE PROCEDURE update_productReview(IN pnId INT, IN pnScore DECIMAL(4,2), IN pnComment VARCHAR(45), IN pnUsernameWriter VARCHAR(45), IN pnIdProduct INT)
    BEGIN
            UPDATE product_review
            SET 
            score = pnScore,
            comment = pnComment,
            username_writer = pnUsernameWriter,
            id_product = pnIdProduct
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_productReview(IN pnId INT)
        BEGIN
            DELETE FROM product_review
            WHERE id = pnId;
    END//

CREATE FUNCTION getScore_productReview(vId INT) 
RETURNS DECIMAL(4,2)
DETERMINISTIC
    BEGIN
        DECLARE rScore DECIMAL(4,2);
        SET rScore = 0;
            SELECT score
            INTO rScore
            FROM product_review
            WHERE id = vId;
    RETURN rScore;
    END //

CREATE FUNCTION getComment_productReview(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rComment VARCHAR(45);
        SET rComment = "";
            SELECT comment
            INTO rComment
            FROM product_review
            WHERE id = vId;
    RETURN rComment;
    END //

CREATE FUNCTION getUsernameWriter_productReview(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SET rUsernameWriter = "";
            SELECT username_writer
            INTO rUsernameWriter
            FROM product_review
            WHERE id = vId;
    RETURN rUsernameWriter;
    END //

CREATE PROCEDURE getAll_productReview()
    BEGIN
            SELECT id, score, comment, username_writer, id_product
            FROM product_review;
    END//
DELIMITER ;