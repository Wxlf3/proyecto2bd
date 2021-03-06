package Connection;

import BL.product;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class currentUser 
{
    private String username;
    private int id_userType;
    private boolean isAdmin ;
    private ArrayList<product> history = new ArrayList<product>();
    private static currentUser instance = null;
    protected currentUser(){}

    public static currentUser getInstance()
    {
	if (instance == null)
	{
            instance = new currentUser();
	}
       return instance;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public int getId_userType() {
        return id_userType;
    }

    public void setId_userType(int pid_userType) {
        if(pid_userType == 1)
            isAdmin = true;
        this.id_userType = id_userType;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public ArrayList<product> getHistory() {
        return history;
    }

    public void insertInHistory(product p) {
        this.history.add(p);
    }
}
