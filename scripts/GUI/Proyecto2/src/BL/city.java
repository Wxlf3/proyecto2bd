package BL;

/**
 *
 * @author sebas
 */
public class city 
{
    private int id;
    private String name;
    private int id_state;

    public city(String name, int id_state) {
        this.name = name;
        this.id_state = id_state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_state() {
        return id_state;
    }

    public void setId_state(int id_state) {
        this.id_state = id_state;
    }
    
    
}
