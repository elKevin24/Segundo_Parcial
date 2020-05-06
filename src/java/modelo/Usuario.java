
package modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.BeanUsuario;
import java.sql.ResultSet;
import java.util.LinkedList;



public class Usuario {
 
public static LinkedList<BeanUsuario> consultarUsuario() throws SQLException
{
     LinkedList<BeanUsuario> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT id, lote, fecha, campo, cantidad, variedad, calidad from Coffe" )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId(rs.getString("id"));       
                        user.setLote(rs.getString("lote"));             
                        user.setFecha(rs.getString("fecha"));   
                        user.setCampo(rs.getString("campo"));
                        user.setCantidad(rs.getString("cantidad"));         
                        user.setVariedad(rs.getString("variedad"));       
                        user.setCalidad(rs.getString("calidad"));     
                                                                            
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


     


public static LinkedList<BeanUsuario> consultarUsuarioLike(String Lote) throws SQLException
{
     LinkedList<BeanUsuario> usuarios = new LinkedList<>();
            int Lt = Integer.valueOf(Lote);
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT * FROM Coffe WHERE lote = "+Lt+"" )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId(rs.getString("id"));       
                        user.setLote(rs.getString("lote"));             
                        user.setFecha(rs.getString("fecha"));   
                        user.setCampo(rs.getString("campo"));
                        user.setCantidad(rs.getString("cantidad"));         
                        user.setVariedad(rs.getString("variedad"));       
                        user.setCalidad(rs.getString("calidad"));     
                                                                            
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

                           
public static boolean ActualizarUsuario(BeanUsuario usuario)
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
                
                String sql="update Coffe set lote='"+usuario.getLote()+"', fecha='"+usuario.getFecha()+"', campo='"+usuario.getCampo()+"', cantidad='"+usuario.getCantidad()+"', variedad='"+usuario.getVariedad()+"', calidad='"+usuario.getCalidad()+"'";
                         //"update tbl_seccion set grado ='"+usuario.getGrado()+"', seccion='"+usuario.getSeccion()+"', Id_nivel='"+usuario.getId_nivel()+"' where Id_seccion="+usuario.getId_seccion()+"";
                  
                st.execute(sql);
                actualizado=true;
                st.close();
            }                  
                                    
    }                       
   catch (SQLException e)         
   {                            
      actualizado=false;             
   }                                
                               
    return actualizado;          
 }      
                                 
public static BeanUsuario ObtenerUsuario(String id)
{                  
    BeanUsuario user = new BeanUsuario();
               
     try        
      {        
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
        try (ResultSet rs = st.executeQuery("SELECT id, lote, fecha, campo, cantidad, variedad, calidad from Coffe where Id="+id+"")) {
            while (rs.next())
            {
                                      
                
                
                        user.setId(rs.getString("id"));       
                        user.setLote(rs.getString("lote"));             
                        user.setFecha(rs.getString("fecha"));   
                        user.setCampo(rs.getString("campo"));
                        user.setCantidad(rs.getString("cantidad"));         
                        user.setVariedad(rs.getString("variedad"));       
                        user.setCalidad(rs.getString("calidad"));
                
                
                
            }
        }
            st.close();
        }
      }
     catch(SQLException e)
     {
     }
    return user;
    
}   
 
public static boolean eliminarUsuario(String id)
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
                String sql="DELETE FROM Coffe WHERE Id="+id+"";               
                st.execute(sql);
                eliminado=true;
                st.close();
            }                                            
    }
    catch (SQLException e)
    {
       eliminado=false;
    }
    
    return eliminado;
}   
//    
 public static boolean agregarUsuario(BeanUsuario Alumno)
 {
  boolean agregado=false;
  try {
    Conexion c=new Conexion();
    Connection con=c.getConexion();
    if(con!=null){
    Statement st;
    st = con.createStatement();
    //campos de la tabla
    
    String sql="INSERT INTO Coffe(lote, fecha, campo, cantidad, variedad, calidad) VALUES ('"+Alumno.getLote()+"','"+Alumno.getFecha()+"','"+Alumno.getCampo()+"','"+Alumno.getCantidad()+"','"+Alumno.getVariedad()+"','"+Alumno.getCalidad()+"')";
                                                                                       
    System.out.println(sql);                                                                     
    st.execute(sql);                                                                                             
                                                                                                                  
    agregado=true;                                                                                             
    st.close();                                                                                               
   }                                                                                                          
                                                                                                             
  } catch (SQLException e) {                                                                                 
    agregado=false;                                                                                          
  }                                                       
  return agregado;                                    
 }                                                    
 

}