package BL;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class order 
{
    private int id;
    private float price;
    private int quantity;
    private String user_buyer;
    private int id_product;

    public order(float price, int quantity, String user_buyer, int id_product) {
        this.price = price;
        this.quantity = quantity;
        this.user_buyer = user_buyer;
        this.id_product = id_product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUser_buyer() {
        return user_buyer;
    }

    public void setUser_buyer(String user_buyer) {
        this.user_buyer = user_buyer;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}
