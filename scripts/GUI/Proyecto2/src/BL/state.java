package BL;

/**
 *
 * @author sebas
 */
public class state 
{
    private int id;
    private String name;
    private int id_country;

    public state(String name, int id_country) {
        this.name = name;
        this.id_country = id_country;
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

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }
    
     
}
