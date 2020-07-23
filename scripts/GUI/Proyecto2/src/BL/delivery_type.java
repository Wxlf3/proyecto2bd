package BL;

/**
 *
 * @author sebas
 */
public class delivery_type 
{
    private int id;
    private String description;

    public delivery_type(String description) {
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
