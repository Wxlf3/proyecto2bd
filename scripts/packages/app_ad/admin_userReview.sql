-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_userReview;
DROP PROCEDURE IF EXISTS update_userReview;
DROP PROCEDURE IF EXISTS remove_userReview;
DROP FUNCTION IF EXISTS getScore_userReview;
DROP FUNCTION IF EXISTS getComment_userReview;
DROP FUNCTION IF EXISTS getIdTypeReview_userReview;
DROP FUNCTION IF EXISTS getUsernameWriter_userReview;
DROP FUNCTION IF EXISTS getUsernameReceiver_userReview;
DROP PROCEDURE IF EXISTS getAll_userReview;
DROP PROCEDURE IF EXISTS get_reviews_of_user;
DELIMITER //

CREATE PROCEDURE insert_userReview(IN pnScore DECIMAl(4,2), 
                                    IN pnComment VARCHAR(200), 
                                    IN pnIdTypeReview INT, 
                                    IN pnUsernameWriter VARCHAR(45), 
                                    IN pnUsernameReceiver VARCHAR(45))
    BEGIN
            INSERT INTO user_review(score, comment, id_type_review, username_writer, username_receiver)
            VALUES (pnScore, pnComment, pnIdTypeReview, pnUsernameWriter, pnUsernameReceiver);
    END //

CREATE PROCEDURE update_userReview(IN pnId INT, 
                                    IN pnScore DECIMAl(4,2), 
                                    IN pnComment VARCHAR(200), 
                                    IN pnIdTypeReview INT, 
                                    IN pnUsernameWriter VARCHAR(45), 
                                    IN pnUsernameReceiver VARCHAR(45))
    BEGIN
            UPDATE user_review
            SET 
            score = pnScore,
            comment = pnComment,
            id_type_review = pnIdTypeReview,
            username_writer = pnUsernameWriter,
            username_receiver = pnUsernameReceiver
            WHERE id = pnId;
    END //

CREATE PROCEDURE remove_userReview(IN pnId INT)
        BEGIN
            DELETE FROM user_review
            WHERE id = pnId;
    END//

CREATE FUNCTION getScore_userReview(vId INT) 
RETURNS DECIMAL(4,2)
DETERMINISTIC
    BEGIN
        DECLARE rScore DECIMAL(4,2);
        SET rScore = 0;
            SELECT score
            INTO rScore
            FROM user_review
            WHERE id = vId;
    RETURN rScore;
    END //

CREATE FUNCTION getComment_userReview(vId INT) 
RETURNS VARCHAR(200)
DETERMINISTIC
    BEGIN
        DECLARE rComment VARCHAR(200);
        SET rComment = "";
            SELECT comment
            INTO rComment
            FROM user_review
            WHERE id = vId;
    RETURN rComment;
    END //

CREATE FUNCTION getIdTypeReview_userReview(vId INT) 
RETURNS INT
DETERMINISTIC
    BEGIN
        DECLARE rIdTypeReview INT;
        SET rIdTypeReview = 0;
            SELECT comment
            INTO rIdTypeReview
            FROM user_review
            WHERE id = vId;
    RETURN rIdTypeReview;
    END //

CREATE FUNCTION getUsernameWriter_userReview(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SET rUsernameWriter = "";
            SELECT username_writer
            INTO rUsernameWriter
            FROM user_review
            WHERE id = vId;
    RETURN rUsernameWriter;
    END //

CREATE FUNCTION getUsernameReceiver_userReview(vId INT) 
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
        DECLARE rUsernameReceiver VARCHAR(45);
        SET rUsernameReceiver = "";
            SELECT username_receiver
            INTO rUsernameReceiver
            FROM user_review
            WHERE id = vId;
    RETURN rUsernameReceiver;
    END //

CREATE PROCEDURE getAll_userReview()
    BEGIN
            SELECT id, score, comment, id_type_review, username_writer, username_receiver
            FROM user_review;
    END//
    
CREATE PROCEDURE get_reviews_of_user(IN pnUsername VARCHAR(45))
BEGIN
	SELECT r.id, r.score, r.comment, t.name, r.username_writer
    FROM `user_review` r
    INNER JOIN `review_type` t ON t.id = r.id_type_review
    WHERE r.username_receiver = pnUsername;
END//
DELIMITER ;