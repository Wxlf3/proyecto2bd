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
<<<<<<< HEAD
<<<<<<< HEAD
    private static final String user="app_ad";
    private static final String pass="app_ad";
    private static final String url="jdbc:mysql://127.0.0.1:3306/app_ad?user=app_ad";
=======
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
>>>>>>> parent of 92f0294... Changes
=======
    private static final String user="person_ad";
    private static final String pass="person_ad";
    private static final String url="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
>>>>>>> parent of f685f8d... Changes
    
    public void conector() {
        con=null;
        try{
            con= (Connection) DriverManager.getConnection(url, user, pass);
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (SQLException e){
            System.out.println("Error de conexion" + e);
        }
<<<<<<< HEAD
    }
    
<<<<<<< HEAD
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
=======
    public static void insertUser(user pUser) throws SQLException 
    {        
        String host = "jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
        String uName = "person_ad";
        String uPass = "person_add";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmnt = (CallableStatement) con.prepareCall("{ call adminUser.createUser(?,?,?,?) } ");
        
        stmnt.execute();
    }
    
>>>>>>> parent of 92f0294... Changes
=======
    }    
>>>>>>> parent of f685f8d... Changes
}