/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AESConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Paez
 */
public class DBConnection {
    
    public String db= "ExpertSystemAutismDB";
    public String url="jdbc:mysql://127.0.0.1/" + db;
    public String user= "root";
    public String pass="123456";
    
    public DBConnection(){
        
    }
    
    public Connection ConnecrDb(){
       Connection cn= null;
       
       try{
        Class.forName("org.gjt.mm.mysql.Driver");
        cn=DriverManager.getConnection(this.url, this.user, this.pass);   
       }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showConfirmDialog(null, e);   
       }    
        return cn;
    }

 
    
}
