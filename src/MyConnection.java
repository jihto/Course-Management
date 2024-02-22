/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.sql.*;
import javax.swing.*;
public class MyConnection {
    public Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL = "jdbc:sqlserver://localhost:1433;Database=quanlysinhvien;user=admin;password=123";
            Connection connect = DriverManager.getConnection(URL);
            return connect;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
}