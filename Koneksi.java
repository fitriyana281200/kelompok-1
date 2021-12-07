/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buku;

/**
 *
 * @author User
 */
import java.sql. *;
import javax.swing.JOptionPane;

public class Koneksi {
  private static Connection databasekoneksi;
  public static Connection KoneksiDB() throws SQLException{
      if (databasekoneksi == null){
          try {
              String DB = "jdbc:mysql://localhost:3306/dabar";
              String nama = "root";
              String alamat = "";
              
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
              databasekoneksi = (Connection) DriverManager.getConnection(DB,nama,alamat);
   
          } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "koneksi GAGAL");
          }
      
      } return  databasekoneksi;

  }
}
    

