
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.Validar;
import modelo.persona;

public class personaDAO implements Validar {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;    
    
    @Override
    public int Validar(persona per) {
        int r=0;
        String sql="select * from tbl_login where Usuario=? and clave=?";
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, per.getUsuario());
            ps.setString(2, per.getClave());
            rs=ps.executeQuery();
            while(rs.next()){
                r=r+1;
                per.setUsuario(rs.getString("Usuario"));
                per.setClave(rs.getString("clave"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        }catch (SQLException e){     
            return 0;
        }
    }
    
}
