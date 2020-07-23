package BL;

/**
 *
 * @author sebas
 */
public class user_X_paymentMethod 
{
    private String username;
    private int id_payment_method;

    public user_X_paymentMethod(String username, int id_payment_method) {
        this.username = username;
        this.id_payment_method = id_payment_method;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_payment_method() {
        return id_payment_method;
    }

    public void setId_payment_method(int id_payment_method) {
        this.id_payment_method = id_payment_method;
    }
    
    
}
