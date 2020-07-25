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
    private static final String user="app_ad";
    private static final String pass="app_ad";
    private static final String url="jdbc:mysql://127.0.0.1:3306/app_ad?user=app_ad";
    
    public void conector() {
        con=null;
        try{
            con=  DriverManager.getConnection(url, user, pass);
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (SQLException e){
            System.out.println("Error de conexion" + e);
        }
    }
    
    public void insertDeliveryType(String pDescription) {
        con=null;
        try{
            con=  DriverManager.getConnection(url, user, pass);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, pDescription);
            if (stmt!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (SQLException e){
            System.out.println("Error de conexion" + e);
        }
    }
}