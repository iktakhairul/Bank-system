/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

/**
 *
 * @author iktakhairul
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn = null; //// why it use i dont khow
    public static Connection ConnecrDb(){////maybe can edit Db to DB  ***************
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/iktakhairul/Documents/Bank/bank.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
   
}
