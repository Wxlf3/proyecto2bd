package BL;

/**
 *
 * @author sebas
 */
public class district 
{
    private int id;
    private String name;
    private int id_city;

    public district(String name, int id_city) {
        this.name = name;
        this.id_city = id_city;
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

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
    
    
}
