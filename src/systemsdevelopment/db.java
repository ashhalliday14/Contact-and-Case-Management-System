/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemsdevelopment;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ashleigh.halliday
 */
public class db {
    
    public static void main(String args[]){
        Connect();
    }
    
    public static Connection Connect(){
        try{;
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ashleigh.halliday\\OneDrive - Accenture\\Documents\\Uni\\Level 6\\CMP330 Systems Development\\Submission\\Database\\tbl_login.db");
            return conn;
        }
        catch (Exception e){
            System.out.println("Error: " + e);
            return null;
        }
    }
    
}
