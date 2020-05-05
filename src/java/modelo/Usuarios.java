
package modelo;

import controlador.BeanUsuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;




public class Usuarios {
    
    public static LinkedList<BeanUsuarios> consultarUsuarios() throws SQLException
{
     LinkedList<BeanUsuarios> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_usuario, nombre, apellido, contraseña\n" +
"FROM tbl_usuario" )) {
                    while (rs.next())
                    {
                        BeanUsuarios user = new BeanUsuarios();
                        user.setId_usuario(rs.getString("id_usuario"));
                        user.setNombre(rs.getString("nombre"));
                        user.setApellido(rs.getString("apellido"));
                        user.setContraseña(rs.getString("contraseña"));
                         
                        usuarios.add(user);
                    }  }
             st.close();
         }
      }
     catch (SQLException e)
      {
      }
    
    return usuarios;
}
    
public static boolean ActualizarUsuarios(BeanUsuarios usuario)
{
    boolean actualizado = false;  
   
    try
    {
         Conexion c=new Conexion();
         Connection con=c.getConexion();
            if(con!=null)
            {
                Statement st;        
                st = con.createStatement();    
                //UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql="update tbl_usuario set nombre ='"+usuario.getNombre()+"',apellido='"+usuario.getApellido()+"',contraseña='"+usuario.getContraseña()+"' where Id_usuario="+usuario.getId_usuario()+"";
                st.execute(sql);
                actualizado=true;
                st.close();
            }
                                    
    }
   catch (SQLException e)
   {
      actualizado=false;
       e.printStackTrace();
   }
     
    return actualizado;
 }    
    
public static BeanUsuarios ObtenerUsuarios(String id)
{
    BeanUsuarios user = new BeanUsuarios();
    
     try
      {
    Conexion c=new Conexion();
            Connection con=c.getConexion();
             Statement st;
             st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from tbl_usuario where Id_usuario="+id+"");
                  while (rs.next())
                  {
                   
                     user.setId_usuario(rs.getString("Id_usuario"));
                     user.setNombre (rs.getString("Nombre"));
                     user.setApellido (rs.getString("Apellido"));
                     user.setContraseña(rs.getString("Contraseña"));
   
                  }
                  rs.close();
                  st.close();
                  con.close();
      }
     catch(Exception e)
     {
           e.printStackTrace();
     }
    return user;
    
}    

public static boolean eliminarUsuarios(String id)
{
    boolean eliminado = false;    
    try
    {
         Conexion c=new Conexion();
         Connection con=c.getConexion();
            if(con!=null)
            {
                Statement st;        
                st = con.createStatement();    
                String sql="delete from tbl_usuario where Id_usuario="+id+"";               
                st.execute(sql);
                eliminado=true;
                st.close();
            }
              
                      
   
    }
   catch (SQLException e)
   {
      eliminado=false;
       e.printStackTrace();
   }
    
    return eliminado;
}
    

 public static boolean agregarUsuarios(BeanUsuarios Usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    //campos de la tabla
    String sql="INSERT INTO tbl_usuario(id_usuario, nombre, apellido, contraseña) VALUES ('"+Usuario.getId_usuario()+"','"+Usuario.getNombre()+"','"+Usuario.getApellido()+"','"+Usuario.getContraseña()+"')";
    
    System.out.println(sql);
    st.execute(sql);
    
    agregado=true;
    st.close();
   }
  
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
 
}
