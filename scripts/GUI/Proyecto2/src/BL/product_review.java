package BL;

/**
 *
 * @author sebas
 */
public class product_review 
{
    private int id;
    private float score;
    private String comment;
    private String username_writer;
    private int idProduct;

    public product_review(float score, String comment, String username_writer, int idProduct) {
        this.score = score;
        this.comment = comment;
        this.username_writer = username_writer;
        this.idProduct = idProduct;
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

    public String getUsername_writer() {
        return username_writer;
    }

    public void setUsername_writer(String username_writer) {
        this.username_writer = username_writer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}