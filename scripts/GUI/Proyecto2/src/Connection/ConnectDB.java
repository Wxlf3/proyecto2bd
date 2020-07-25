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
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
    
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
    }
    
    public static void insertUser(user pUser) throws SQLException 
    {        
        String host = "jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
        String uName = "person_ad";
        String uPass = "person_add";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmnt = (CallableStatement) con.prepareCall("{ call adminUser.createUser(?,?,?,?) } ");
        
        stmnt.execute();
    }
    
}