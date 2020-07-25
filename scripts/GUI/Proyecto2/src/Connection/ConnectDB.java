package Connection;

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
    private static final String pass="Saprissa1";
    private static final String url="jdbc:mysql://127.0.0.1:3306/person_ad?user=person_ad";
    
    public void conector() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            //Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (SQLException e){
            System.out.println("Error de conexion" + e);
        }
    }
    
}