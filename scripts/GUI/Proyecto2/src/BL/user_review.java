package BL;

/**
 *
 * @author sebas
 */
public class user_review 
{
    private int id;
    private float score;
    private String comment;
    private int id_type_review;
    private String username_writer;
    private String username_receiver;

    public user_review(float score, String comment, int id_type_review, String username_writer, String username_receiver) {
        this.score = score;
        this.comment = comment;
        this.id_type_review = id_type_review;
        this.username_writer = username_writer;
        this.username_receiver = username_receiver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId_type_review() {
        return id_type_review;
    }

    public void setId_type_review(int id_type_review) {
        this.id_type_review = id_type_review;
    }

    public String getUsername_writer() {
        return username_writer;
    }

    public void setUsername_writer(String username_writer) {
        this.username_writer = username_writer;
    }

    public String getUsername_receiver() {
        return username_receiver;
    }

    public void setUsername_receiver(String username_receiver) {
        this.username_receiver = username_receiver;
    }
    
    
}
