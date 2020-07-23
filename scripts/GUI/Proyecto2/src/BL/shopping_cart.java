package BL;

/**
 *
 * @author sebas
 */
public class shopping_cart 
{
    private String username;
    private int id_product;
    private int quantity;

    public shopping_cart(String username, int id_product, int quantity) {
        this.username = username;
        this.id_product = id_product;
        this.quantity = quantity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
