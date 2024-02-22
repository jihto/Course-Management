/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DBAccess {
    private Connection connect;
    private Statement stmt; 
    public DBAccess(){
        try{
            MyConnection sqlconnect = new MyConnection();
            connect = sqlconnect.getConnection();
            stmt = connect.createStatement();
        }catch(Exception ex){ 
            
        }
    }
    public int Update(String str){
        try{
            int i = stmt.executeUpdate(str);
            return i;
        }catch(Exception ex){
            return -1;
        }
    }
    public ResultSet Query(String str){
        try{
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        }
        catch(Exception ex){
            return null;
        } 
    }
}
