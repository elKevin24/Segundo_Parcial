/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
/**
 *
 * @author busqu
 */
public class Datosconexion extends Conexion {
    Connection con = getConexion();
    public int provarconexion (){
        int conexion =0;
        try {
            PreparedStatement ps = null;
            ResultSet rs= null;
            ps = con.prepareStatement("SELECT Id_user, nombre, pass FROM User");
            rs = ps.executeQuery();
            if(rs.next()){
                conexion = 1;
            }
        } catch (Exception e) {
        }
        return conexion ;
        
    }
    
    
    
}
