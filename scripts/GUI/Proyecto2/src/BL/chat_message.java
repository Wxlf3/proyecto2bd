package BL;

import java.util.Date;
import java.sql.Types;

/**
 *
 * @author sebas
 */
public class chat_message 
{
    private int id;
    private java.sql.Date date;
    private String message;
    private String username_writer;
    private int id_chat;

    public chat_message(java.sql.Date date, String message, String username_writer, int id_chat) {
        this.date = date;
        this.message = message;
        this.username_writer = username_writer;
        this.id_chat = id_chat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername_writer() {
        return username_writer;
    }

    public void setUsername_writer(String username_writer) {
        this.username_writer = username_writer;
    }

    public int getId_chat() {
        return id_chat;
    }

    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
    }
    
    
}
