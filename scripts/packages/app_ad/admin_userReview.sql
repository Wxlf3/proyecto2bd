-- Connected from APP_AD
DROP PROCEDURE IF EXISTS insert_userReview;
DROP PROCEDURE IF EXISTS update_userReview;
DROP PROCEDURE IF EXISTS remove_userReview;
DROP PROCEDURE IF EXISTS getScore_userReview;
DROP PROCEDURE IF EXISTS getComment_userReview;
DROP PROCEDURE IF EXISTS getIdTypeReview_userReview;
DROP PROCEDURE IF EXISTS getUsernameWriter_userReview;
DROP PROCEDURE IF EXISTS getUsernameReceiver_userReview;
DROP PROCEDURE IF EXISTS getAll_category;
DELIMITER //

CREATE PROCEDURE insert_userReview(IN pnScore DECIMAl(4,2), in pnComment VARCHAR(200), IN pnIdTypeReview INT, IN pnUsernameWriter VARCHAR(45), IN pnUsernameReceiver VARCHAR(45))
    BEGIN
            INSERT INTO user_review(score, comment, id_type_review, username_writer, username_receiver)
            VALUES (pnScore, pnComment, pnIdTypeReview, pnUsernameWriter, pnUsernameReceiver);
    END //

CREATE PROCEDURE update_userReview(IN pnId INT, IN pnScore DECIMAl(4,2), in pnComment VARCHAR(200), IN pnIdTypeReview INT, IN pnUsernameWriter VARCHAR(45), IN pnUsernameReceiver VARCHAR(45))
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

CREATE PROCEDURE getScore_userReview(vId INT)
    BEGIN
        DECLARE rScore DECIMAL(4,2);
        SELECT score
        FROM user_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getComment_userReview(vId INT)
    BEGIN
        DECLARE rComment VARCHAR(200);
        SELECT comment
        FROM user_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getIdTypeReview_userReview(vId INT)
    BEGIN
        DECLARE rIdTypeReview INT;
        SELECT id_type_review
        FROM user_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getUsernameWriter_userReview(vId INT)
    BEGIN
        DECLARE rUsernameWriter VARCHAR(45);
        SELECT username_writer
        FROM user_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getUsernameReceiver_userReview(vId INT)
    BEGIN
        DECLARE rUsernameReceiver VARCHAR(45);
        SELECT username_receiver
        FROM user_review
        WHERE id = vId;
    END//

CREATE PROCEDURE getAll_userReview()
    BEGIN
        DECLARE ROWCOUNT int;
            SELECT id, score, comment, id_type_review, username_writer, username_receiver
            FROM user_review;
    END//
DELIMITER ;