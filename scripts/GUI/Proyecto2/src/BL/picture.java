package BL;

/**
 *
 * @author sebas
 */
public class picture 
{
    private int id;
    private String path;
    private int id_product;

    public picture(String path, int id_product) {
        this.path = path;
        this.id_product = id_product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
    
    
}
