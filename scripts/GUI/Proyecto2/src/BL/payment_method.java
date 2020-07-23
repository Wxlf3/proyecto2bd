package BL;

/**
 *
 * @author sebas
 */
public class payment_method 
{
    private int id;
    private String description;

    public payment_method(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
