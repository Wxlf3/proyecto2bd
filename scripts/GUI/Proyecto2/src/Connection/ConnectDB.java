package Connection;

import BL.user;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class ConnectDB {
   
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user_app="app_ad";
    private static final String pass_app="app_ad";
    private static final String url_app="jdbc:mysql://127.0.0.1:3306/app_ad?user=app_ad";
    private static final String user_person="person_ad";
    private static final String pass_person="person_ad";
    private static final String url_person="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
    


//Category package
    
    public void insertCategory(String pDescription) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, pDescription);
            stmt.execute();
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
    }
    
    public void insertDeliveryType(String pDescription) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, pDescription);
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
    }
    
    
    //Funciones generalizadas
    public void removeWithId(int pId, String function,boolean inApp) {
        con=null;
        
        try{
            if(inApp)
                con=  DriverManager.getConnection(url_app, user_app, pass_app);
            else
                con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call "+ function +" (?)}");
            stmt.setInt(1, pId);
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
    }
    
    public void removeWithUsername(String pUsername, String function, boolean inApp) {
        con=null;
        
        try{
            if(inApp)
                con=  DriverManager.getConnection(url_app, user_app, pass_app);
            else
                con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call "+ function +" (?)}");
            stmt.setString(1, pUsername);
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion" + e);
        }
    }
    
}