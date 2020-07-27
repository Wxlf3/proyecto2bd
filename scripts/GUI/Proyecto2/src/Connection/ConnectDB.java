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
            CallableStatement stmt = con.prepareCall("{call insert_category(?)}");
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
    
    public void insertDeliveryType(delivery_type dt) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, dt.getDescription());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertOrder(order o) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_order(?,?,?,?,?)}");
            stmt.setFloat(1, o.getPrice());
            stmt.setInt(2, o.getQuantity());
            stmt.setDate(3, o.getDate());
            stmt.setString(4, o.getUser_buyer());
            stmt.setInt(5, o.getId_product());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPaymentMethod(payment_method pm) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_paymentMethod(?)}");
            stmt.setString(1, pm.getDescription());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPicture(picture p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_picture(?)}");
            stmt.setString(1, p.getPath());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertProduct(product p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_product(?,?,?,?,?,?,?,?)}");
            stmt.setFloat(1, p.getPrice());
            stmt.setString(2, p.getName());
            stmt.setString(3, p.getDescription());
            stmt.setInt(4, p.getQuant_in_stock());
            stmt.setBoolean(5, p.isIs_visible());
            stmt.setInt(6, p.getId_category());
            stmt.setString(7, p.getUsername_seller());
            stmt.setInt(8, p.getId_delivery_type());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertProductReview(product_review p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_product(?,?,?,?)}");
            stmt.setFloat(1, p.getScore());
            stmt.setString(2, p.getComment());
            stmt.setString(3, p.getUsername_writer());
            stmt.setInt(4, p.getIdProduct());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertReviewType(review_type p) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_reviewType(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertShoppingCart(shopping_cart p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_shoppingCart(?,?,?)}");
            stmt.setString(1, p.getUsername());
            stmt.setInt(2, p.getId_product());
            stmt.setInt(3, p.getQuantity());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUser(user u) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_user(?,?,?)}");
            stmt.setString(1, u.getUsername());
            stmt.setString(2, u.getPassword());
            stmt.setInt(3, u.getId_user_type());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUserReview(user_review u) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userReview(?,?,?,?,?)}");
            stmt.setFloat(1, u.getScore());
            stmt.setString(2, u.getComment());
            stmt.setInt(3, u.getId_type_review());
            stmt.setString(4, u.getUsername_writer());
            stmt.setString(5, u.getUsername_receiver());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUserType(user_type ut) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userType(?)}");
            stmt.setString(1, ut.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insert_userXpaymentMethod(user_X_paymentMethod up) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userXpaymentMethod(?,?)}");
            stmt.setString(1, up.getUsername());
            stmt.setInt(2, up.getId_payment_method());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertWishList(wish_list w) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_wishList(?,?,?)}");
            stmt.setString(1, w.getUsername());
            stmt.setInt(2, w.getId_product());
            stmt.setInt(3, w.getQuantity());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertCity(city c) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_city`(?,?)}");
            stmt.setString(1, c.getName());
            stmt.setInt(2, c.getId_state());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertCountry(country p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_country`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertDistrict(district p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_country`(?,?)}");
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getId_city());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertGender(gender p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_gender`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertNationality(nationality p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_nationality`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPerson(person p) { //terminar, no se si el id de person es un int o un string
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_person`(?,?,?,?,?,?,?,?,?,?,?)}");
            stmt.setString(1, p.getId());
            stmt.setString(2, p.getFirst_name());
            stmt.setString(3, p.getMiddle_name());
            stmt.setString(4, p.getLast_name());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getPhone_number());
            stmt.setDate(7, p.getBirthday());
            stmt.setString(8, p.getPicture_path());
            stmt.setInt(9, p.getId_gender());
            stmt.setInt(10, p.getId_district());
            stmt.setString(11, p.getUsername());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPersonXNationality(person_X_nationality p) { //terminar, no se si el id de person es un int o un string
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_person_x_nationality`(?,?)}");
            //stmt.setInt(1, p.getId_person());
            stmt.setInt(2, p.getId_nationality());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertState(state p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_state`(?,?)}");
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getId_country());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    // Updates
    
    public void updateCategory(category pCategory) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call update_category(?,?)}");
            stmt.setInt(1, pCategory.getId());
            stmt.setString(2, pCategory.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void updateChat(chat pChat) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call update_chat(?,?)}");
            stmt.setInt(1, pChat.getId());
            stmt.setInt(1, pChat.getId_order());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void updateChatMessage(chat_message p) {
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
    /*
    public void insertDeliveryType(delivery_type dt) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_delivery_type(?)}");
            stmt.setString(1, dt.getDescription());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertOrder(order o) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_order(?,?,?,?,?)}");
            stmt.setFloat(1, o.getPrice());
            stmt.setInt(2, o.getQuantity());
            stmt.setDate(3, o.getDate());
            stmt.setString(4, o.getUser_buyer());
            stmt.setInt(5, o.getId_product());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPaymentMethod(payment_method pm) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_paymentMethod(?)}");
            stmt.setString(1, pm.getDescription());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPicture(picture p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_picture(?)}");
            stmt.setString(1, p.getPath());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertProduct(product p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_product(?,?,?,?,?,?,?,?)}");
            stmt.setFloat(1, p.getPrice());
            stmt.setString(2, p.getName());
            stmt.setString(3, p.getDescription());
            stmt.setInt(4, p.getQuant_in_stock());
            stmt.setBoolean(5, p.isIs_visible());
            stmt.setInt(6, p.getId_category());
            stmt.setString(7, p.getUsername_seller());
            stmt.setInt(8, p.getId_delivery_type());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertProductReview(product_review p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_product(?,?,?,?)}");
            stmt.setFloat(1, p.getScore());
            stmt.setString(2, p.getComment());
            stmt.setString(3, p.getUsername_writer());
            stmt.setInt(4, p.getIdProduct());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertReviewType(review_type p) {
        con=null;
        
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_reviewType(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertShoppingCart(shopping_cart p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_shoppingCart(?,?,?)}");
            stmt.setString(1, p.getUsername());
            stmt.setInt(2, p.getId_product());
            stmt.setInt(3, p.getQuantity());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUser(user u) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_user(?,?,?)}");
            stmt.setString(1, u.getUsername());
            stmt.setString(2, u.getPassword());
            stmt.setInt(3, u.getId_user_type());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUserReview(user_review u) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userReview(?,?,?,?,?)}");
            stmt.setFloat(1, u.getScore());
            stmt.setString(2, u.getComment());
            stmt.setInt(3, u.getId_type_review());
            stmt.setString(4, u.getUsername_writer());
            stmt.setString(5, u.getUsername_receiver());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertUserType(user_type ut) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userType(?)}");
            stmt.setString(1, ut.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insert_userXpaymentMethod(user_X_paymentMethod up) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_userXpaymentMethod(?,?)}");
            stmt.setString(1, up.getUsername());
            stmt.setInt(2, up.getId_payment_method());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertWishList(wish_list w) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_app, user_app, pass_app);
            CallableStatement stmt = con.prepareCall("{call insert_wishList(?,?,?)}");
            stmt.setString(1, w.getUsername());
            stmt.setInt(2, w.getId_product());
            stmt.setInt(3, w.getQuantity());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertCity(city c) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_city`(?,?)}");
            stmt.setString(1, c.getName());
            stmt.setInt(2, c.getId_state());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertCountry(country p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_country`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertDistrict(district p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_country`(?,?)}");
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getId_city());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertGender(gender p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_gender`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertNationality(nationality p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_nationality`(?)}");
            stmt.setString(1, p.getName());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPerson(person p) { //terminar, no se si el id de person es un int o un string
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_person`(?,?,?,?,?,?,?,?,?,?,?)}");
            //stmt.setString(1, p.getId());
            stmt.setString(2, p.getFirst_name());
            stmt.setString(3, p.getMiddle_name());
            stmt.setString(4, p.getLast_name());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getPhone_number());
            stmt.setDate(7, p.getBirthday());
            stmt.setString(8, p.getPicture_path());
            stmt.setInt(9, p.getId_gender());
            stmt.setInt(10, p.getId_district());
            stmt.setString(11, p.getUsername());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertPersonXNationality(person_X_nationality p) { //terminar, no se si el id de person es un int o un string
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_person_x_nationality`(?,?)}");
            //stmt.setInt(1, p.getId_person());
            stmt.setInt(2, p.getId_nationality());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
    
    public void insertState(state p) {
        con=null;
        try{
            con=  DriverManager.getConnection(url_person, user_person, pass_person);
            CallableStatement stmt = con.prepareCall("{call `insert_state`(?,?)}");
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getId_country());
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
    }*/
}