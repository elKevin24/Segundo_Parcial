
package modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.BeanUsuario;
import controlador.BeanUsuarioNotas;
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
                try (ResultSet rs = st.executeQuery("SELECT id_alumno, nombre,ISnull(snombre, '')as snombre, ISnull(tnombre, '')as tnombre, apellido, sapellido, id_seccion\n" +
"FROM            dbo.tbl_alumno where status=1 " )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId_alumno(rs.getString("id_alumno"));       
                        user.setNombre(rs.getString("nombre"));             
                        user.setSnombre(rs.getString("snombre"));   
                        user.setTnombre(rs.getString("tnombre"));
                        user.setApellido(rs.getString("apellido"));         
                        user.setSapellido(rs.getString("sapellido"));       
                        user.setId_seccion(rs.getString("id_seccion"));     
                                                                            
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

public static LinkedList<BeanUsuario> AlumnosGeneralActivos() throws SQLException
{
     LinkedList<BeanUsuario> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
             
//             ISnull(dbo.tbl_alumno.tnombre, '')as tnombre
                try (ResultSet rs = st.executeQuery("SELECT        dbo.tbl_seccion.grado, dbo.tbl_alumno.id_seccion, dbo.tbl_seccion.id_seccion AS Expr1, dbo.tbl_alumno.id_alumno, dbo.tbl_alumno.nombre, ISnull(dbo.tbl_alumno.snombre, '')as snombre , ISnull(dbo.tbl_alumno.tnombre,' ')as tnombre, dbo.tbl_alumno.apellido, \n" +
"                         dbo.tbl_alumno.sapellido\n" +
"FROM            dbo.tbl_alumno INNER JOIN\n" +
"                         dbo.tbl_seccion ON dbo.tbl_alumno.id_seccion = dbo.tbl_seccion.id_seccion\n" +
"WHERE        (dbo.tbl_alumno.status = 1) " )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId_alumno(rs.getString("id_alumno"));       
                        user.setNombre(rs.getString("nombre"));             
                        user.setSnombre(rs.getString("snombre"));   
                        user.setTnombre(rs.getString("tnombre"));
                        user.setApellido(rs.getString("apellido"));         
                        user.setSapellido(rs.getString("sapellido"));       
                        user.setId_seccion(rs.getString("grado"));     
                                                                            
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

public static LinkedList<BeanUsuarioNotas> consultarUsuarioNotas(String A, String B) throws SQLException
{
     LinkedList<BeanUsuarioNotas> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  DISTINCT      dbo.tbl_alumno.id_alumno, dbo.tbl_alumno.nombre, dbo.tbl_alumno.snombre, \n" +
"                       ISnull(dbo.tbl_alumno.tnombre, '')as tnombre , dbo.tbl_alumno.apellido, ISnull(dbo.tbl_alumno.sapellido, '')as sapellido, dbo.tbl_alumno.id_seccion\n" +
"FROM            dbo.tbl_alumno INNER JOIN\n" +
"                         dbo.tbl_notaCurri ON dbo.tbl_alumno.id_alumno = dbo.tbl_notaCurri.id_alumno\n" +
"WHERE        dbo.tbl_notaCurri.nota > 0 and id_seccion = "+A+" and dbo.tbl_notaCurri.unidad =  "+B+"" )) {
                    while (rs.next())
                    {
                        BeanUsuarioNotas user = new BeanUsuarioNotas();
                        user.setId_alumno(rs.getString("id_alumno"));       
                        user.setNombre(rs.getString("nombre"));             
                        user.setSnombre(rs.getString("snombre"));   
                        user.setTnombre(rs.getString("tnombre"));
                        user.setApellido(rs.getString("apellido"));         
                        user.setSapellido(rs.getString("sapellido"));       
                        user.setId_seccion(rs.getString("id_seccion"));  
                        
                                                                            
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


public static LinkedList<BeanUsuario> consultarNotasEx(String A, String B) throws SQLException
{
     LinkedList<BeanUsuario> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  DISTINCT  C.id_alumno, nombre, snombre, tnombre, apellido, sapellido, id_seccion FROM tbl_alumno C, tbl_notaCurri O\n" +
"where id_seccion = "+A+" and O.id_unidad = "+B+"\n" +
"EXCEPT \n" +
"SELECT  DISTINCT C.id_alumno  , nombre, snombre, tnombre, apellido, sapellido, id_seccion FROM tbl_alumno C, tbl_notaCurri O\n" +
"WHERE C.id_alumno = O.id_alumno" )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId_alumno(rs.getString("id_alumno"));       
                        user.setNombre(rs.getString("nombre"));             
                        user.setSnombre(rs.getString("snombre"));   
                        user.setTnombre(rs.getString("tnombre"));
                        user.setApellido(rs.getString("apellido"));         
                        user.setSapellido(rs.getString("sapellido"));       
                        user.setId_seccion(rs.getString("id_seccion"));  
                        
                                                                            
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

     public static LinkedList<BeanUsuario> consultarUsuario2(String seccion) throws SQLException
{
     LinkedList<BeanUsuario> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_alumno, nombre, snombre, ISnull(dbo.tbl_alumno.tnombre, '')as tnombre,  apellido, ISnull(dbo.tbl_alumno.sapellido, '')as sapellido, id_seccion, status\n" +
"FROM            dbo.tbl_alumno\n" +
"WHERE        (id_seccion = "+seccion+") AND (status = 1)\n" +
"ORDER BY apellido"  )) {
                    while (rs.next())
                    {
                        BeanUsuario user = new BeanUsuario();
                        user.setId_alumno(rs.getString("id_alumno"));       
                        user.setNombre(rs.getString("nombre"));             
                        user.setSnombre(rs.getString("snombre")); 
                        user.setTnombre(rs.getString("tnombre")); 
                        user.setApellido(rs.getString("apellido"));         
                        user.setSapellido(rs.getString("sapellido"));       
                        user.setId_seccion(rs.getString("id_seccion"));     
                           
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
                String sql="update tbl_alumno set encargado1 ='"+usuario.getEncargado()+"', telefono='"+usuario.getTelefono()+"', correo='"+usuario.getCorreo()+"',nombre ='"+usuario.getNombre()+"', snombre='"+usuario.getSnombre()+"', tnombre='"+usuario.getTnombre()+"', apellido='"+usuario.getApellido()+"', sapellido='"+usuario.getSapellido()+"', id_seccion='"+usuario.getId_seccion()+"' where id_alumno="+usuario.getId_alumno()+"";
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
public static boolean CambiarEstado(String id)
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
                String sql="update tbl_alumno set status ='0' where id_alumno="+id+"";
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
        try (ResultSet rs = st.executeQuery("select * from tbl_alumno where Id_alumno="+id+"")) {
            while (rs.next())
            {
                user.setEncargado (rs.getString("Encargado1"));
                user.setTelefono(rs.getString("Telefono"));
                user.setCorreo (rs.getString("Correo"));
                user.setId_alumno (rs.getString("Id_alumno"));
                
               
           
               
                user.setNombre (rs.getString("Nombre"));
                user.setSnombre (rs.getString("Snombre"));
                user.setApellido(rs.getString("Apellido"));
                user.setSapellido (rs.getString("Sapellido"));
                user.setId_seccion (rs.getString("Id_seccion"));
                
                
                
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
    
    public static BeanUsuario ObtenerUsuarioNombre(String id)
{                  
    System.err.println(""+id);
    BeanUsuario user = new BeanUsuario();
               
     try        
      {        
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
        try (ResultSet rs = st.executeQuery("select * from tbl_alumno where Id_alumno="+id+"")) {
            while (rs.next())
            {
                
                user.setId_alumno(rs.getString("Id_alumno"));
                user.setNombre(rs.getString("Nombre"));
                System.err.println(""+ rs.getString("Id_alumno"));
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
    
//public static boolean eliminarUsuario(String id)
//{   
//    boolean eliminado = false;    
//    try
//    {
//         Conexion c=new Conexion();
//         Connection con=c.getConexion();
//            if(con!=null)
//            {   
//                Statement st;        
//                st = con.createStatement();    
//                String sql="update tbl_alumno set status =0 where Id_alumno="+id+"";               
//                st.execute(sql);
//                eliminado=true;
//                st.close();
//            }                                            
//    }
//    catch (SQLException e)
//    {
//       eliminado=false;
//    }
//    
//    return eliminado;
//}   
    
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
    String sql="INSERT INTO tbl_alumno(nombre, snombre, tnombre, apellido, sapellido, id_seccion) VALUES ('"+Alumno.getNombre()+"','"+Alumno.getSnombre()+"','"+Alumno.getTnombre()+"','"+Alumno.getApellido()+"','"+Alumno.getSapellido()+"','"+Alumno.getId_seccion()+"')";
                                                                                       
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