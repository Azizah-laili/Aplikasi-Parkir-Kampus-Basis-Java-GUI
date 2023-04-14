/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Koneksi {
    private static Connection mysql_koneksi;
    public static Connection koneksi_db() throws SQLException{
       if(mysql_koneksi==null){
        try {
            String db ="jdbc:mysql://localhost:3306/dbparkir";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysql_koneksi=(Connection) DriverManager.getConnection(db, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal terkoneksi");
        }
        }
       return mysql_koneksi;
    }
}
