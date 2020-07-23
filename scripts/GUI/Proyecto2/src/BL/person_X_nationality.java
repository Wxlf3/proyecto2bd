package BL;

/**
 *
 * @author sebas
 */
public class person_X_nationality 
{
    private String id_person;
    private int id_nationality;

    public person_X_nationality(String id_person, int id_nationality) {
        this.id_person = id_person;
        this.id_nationality = id_nationality;
    }

    public String getId_person() {
        return id_person;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public int getId_nationality() {
        return id_nationality;
    }

    public void setId_nationality(int id_nationality) {
        this.id_nationality = id_nationality;
    }
    
    
}
