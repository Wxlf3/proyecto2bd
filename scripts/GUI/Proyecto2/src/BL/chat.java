package BL;

/**
 *
 * @author sebas
 */
public class chat 
{
    private int id;
    private int id_order;

    public chat(int id_order) {
        this.id_order = id_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }
}
