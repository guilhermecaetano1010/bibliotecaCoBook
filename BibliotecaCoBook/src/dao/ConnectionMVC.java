/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Guilherme
 */
public class ConnectionMVC {
 
    
    public Connection getConnection() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cobook?useSSL=false", "root", "senha");
        } catch (SQLException e) {
        e.printStackTrace();
        }
 
        // Classe de conexão
        
        return conn;
    }
    
}
