package Connection;

import BL.user;
import com.mysql.cj.jdbc.CallableStatement;
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
    private static final String user="person_ad";
    private static final String pass="person_ad";
    private static final String url="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
    
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
}