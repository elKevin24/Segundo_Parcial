
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion 
{
  public Connection con = null;
  
  String cadena = "C:\\Users\\busqu\\Parcial.db";

 public Conexion() {
     
     
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:" + cadena);   
        } catch (SQLException ex){
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      //retorna el link
    
 
 }
 //este es elultimo
 
 public void close(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public Connection getConexion(){
  return con;
 }
 

}