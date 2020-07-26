package Connection;

import BL.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

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
    


    //Inserts
    
    public void insertCategory(category pCategory) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, pCategory.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertChat(chat pChat) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_chat(?)}");
            stmt.setInt(1, pChat.getId_order());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertChatMessage(chat_message p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_chat_message(?,?,?,?)}");
            stmt.setDate(1, p.getDate());
            stmt.setString(2, p.getMessage());
            stmt.setString(3, p.getUsername_writer());
            stmt.setInt(4, p.getId_chat());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertCountry(String pDescription) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_country`(?)}");
            stmt.setString(1, pDescription);
            stmt.execute();
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
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
            System.out.println("Error de conexion: " + e);
        }
    }
    
   
    //Removes
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
            System.out.println("Error de conexion: " + e);
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
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void removeWithUsernameandId(String pUsername, int pId, String function, boolean inApp) {
        con=null;
        
        try{
            if(inApp)
                con=  DriverManager.getConnection(url_app, user_app, pass_app);
            else
                con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call "+ function +" (?,?)}");
            stmt.setString(1, pUsername);
            stmt.setInt(2, pId);
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void remove_person_x_nationality(int pIdPerson, int pIdNationality) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `remove_person_x_nationality` (?,?)}");
            stmt.setInt(1, pIdPerson);
            stmt.setInt(2, pIdNationality);
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    
    //Getters
    
    public void getStringWithId(int pId, String function,boolean inApp) {
        con=null;
        try{
            if(inApp)
                con=  DriverManager.getConnection(url_app, user_app, pass_app);
            else
                con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{ ? = call "+ function +" (?)}");
            stmt.registerOutParameter(1, Types.VARCHAR);
            stmt.setInt(2, pId);
            stmt.execute();
            
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
}