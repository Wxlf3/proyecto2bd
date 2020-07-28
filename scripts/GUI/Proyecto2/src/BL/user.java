package BL;

/**
 *
 * @author sebas
 */
public class user 
{
    private String username;
    private String password;
    private float average_score_buyer;
    private float average_score_seller;
    private int id_user_type;

    public user(String username, String password, float average_score_buyer, float average_score_seller, int id_user_type) {
        this.username = username;
        this.password = password;
        this.average_score_buyer = average_score_buyer;
        this.average_score_seller = average_score_seller;
        this.id_user_type = id_user_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getAverage_score_buyer() {
        return average_score_buyer;
    }

    public void setAverage_score_buyer(float average_score_buyer) {
        this.average_score_buyer = average_score_buyer;
    }

    public float getAverage_score_seller() {
        return average_score_seller;
    }

    public void setAverage_score_seller(float average_score_seller) {
        this.average_score_seller = average_score_seller;
    }

    public int getId_user_type() {
        return id_user_type;
    }

    public void setId_user_type(int id_user_type) {
        this.id_user_type = id_user_type;
    }
    
    
}
