package BL;

/**
 *
 * @author sebas
 */
public class product 
{
    private int id;
    private float price;
    private String name;
    private String description;
    private int quant_in_stock;
    private boolean is_visible;
    private float average_score;
    private int id_category;
    private String username_seller;
    private int id_delivery_type;

    public product(float price, String name, String description, int quant_in_stock, boolean is_visible, float average_score, int id_category, String username_seller, int id_delivery_type) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quant_in_stock = quant_in_stock;
        this.is_visible = is_visible;
        this.average_score = average_score;
        this.id_category = id_category;
        this.username_seller = username_seller;
        this.id_delivery_type = id_delivery_type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuant_in_stock() {
        return quant_in_stock;
    }

    public void setQuant_in_stock(int quant_in_stock) {
        this.quant_in_stock = quant_in_stock;
    }

    public boolean isIs_visible() {
        return is_visible;
    }

    public void setIs_visible(boolean is_visible) {
        this.is_visible = is_visible;
    }

    public float getAverage_score() {
        return average_score;
    }

    public void setAverage_score(float average_score) {
        this.average_score = average_score;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public String getUsername_seller() {
        return username_seller;
    }

    public void setUsername_seller(String username_seller) {
        this.username_seller = username_seller;
    }

    public int getId_delivery_type() {
        return id_delivery_type;
    }

    public void setId_delivery_type(int id_delivery_type) {
        this.id_delivery_type = id_delivery_type;
    }
    
    
    
}
