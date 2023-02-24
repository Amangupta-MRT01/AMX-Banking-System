/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package online.banking.system;

/**
 *
 * @author hp
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class dbconnect {
    
    private static final String username = "root";
    private static final String password = "root";
    private static final String database = "jdbc:mysql://localhost:3306/mybank";

    /**
     * @param args the command line arguments
     */
    public static Connection connectDb() {

        System.out.println("Hello in db connect class");
        Connection conn = null;
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=(Connection)DriverManager.getConnection(database,username,password);
            
           
        }catch(Exception e){
           
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
        
    }
}
