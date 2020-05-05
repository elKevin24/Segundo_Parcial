
package modelo;

import controlador.BeanNotas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class Notas {
    
    
     public static LinkedList<BeanNotas> consultarNotas() throws SQLException
{
     LinkedList<BeanNotas> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_nota, id_alumno, id_curso, nota, id_unidad from tbl_notaCurri " )) {
                    while (rs.next())
                    {
                        BeanNotas user = new BeanNotas();
                        user.setId_nota(rs.getString("id_nota"));
                        user.setId_alumno(rs.getString("id_alumno"));
                        user.setId_curso(rs.getString("id_curso"));
                        user.setNota(rs.getString("nota"));
                        user.setUnidad(rs.getString("unidad"));
                        
                         
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
     
     public static LinkedList<BeanNotas> consultarNotasCurso(int a) throws SQLException
{
     LinkedList<BeanNotas> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_nota, id_alumno, id_curso, ISnull(nota, ' ')as nota, unidad FROM tbl_notaCurri where id_curso = "+a+"" )) {
                    while (rs.next())
                    {
                        BeanNotas user = new BeanNotas();
                        user.setId_nota(rs.getString("id_nota"));
                        user.setId_alumno(rs.getString("id_alumno"));
                        user.setId_curso(rs.getString("id_curso"));
                        user.setNota(rs.getString("nota"));
                        user.setUnidad(rs.getString("unidad"));
                        
                         
                         
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
     
     
     public static LinkedList<BeanNotas> consultarNotasAC(String A, String B) throws SQLException
{
     LinkedList<BeanNotas> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_nota, id_alumno, id_curso, ISnull(nota, ' ')as nota, unidad FROM tbl_notaCurri where id_alumno="+A+"" )) {
                    while (rs.next())
                    {
                        BeanNotas user = new BeanNotas();
                        user.setId_nota(rs.getString("id_nota"));
                        user.setId_alumno(rs.getString("id_alumno"));
                        user.setId_curso(rs.getString("id_curso"));
                        user.setNota(rs.getString("nota"));
                        user.setUnidad(rs.getString("unidad"));
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
     
     public static boolean ActualizarNotas(BeanNotas usuario)
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
                String sql="update tbl_notaCurri set id_alumno ='"+usuario.getId_alumno()+"',id_curso='"+usuario.getId_curso()+"',nota='"+usuario.getNota()+"',unidad='"+usuario.getUnidad()+"' where Id_nota="+usuario.getId_nota()+"";
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
    

     public static BeanNotas ObtenerNotas(String id)
{
    BeanNotas user = new BeanNotas();
    
     try
      {
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
        try (ResultSet rs = st.executeQuery("select * from tbl_notaCurri where Id_nota="+id+"")) {
            while (rs.next())
            {
                
                user.setId_nota(rs.getString("Id_nota"));
                user.setId_alumno (rs.getString("Id_alumno"));
                user.setId_curso (rs.getString("Id_curso"));
                user.setNota(rs.getString("nota"));
                user.setUnidad(rs.getString("unidad"));
                
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
     
    public static BeanNotas ObtenerNotasCurso(String a, String b, String d)
{
    BeanNotas user = new BeanNotas();
    
     try
      {
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
        try (ResultSet rs = st.executeQuery("SELECT  id_nota, id_alumno, id_curso,  ISnull(nota,'') AS nota, unidad"
                + " FROM tbl_notaCurri where id_alumno = "+a+" AND id_curso = "+b+" AND unidad = "+d+"")) {
            while (rs.next())
            {
                
                user.setId_nota(rs.getString("Id_nota"));
                user.setId_alumno (rs.getString("Id_alumno"));
                user.setId_curso (rs.getString("Id_curso"));
                user.setNota(rs.getString("nota"));
                user.setUnidad(rs.getString("id_unidad"));
                
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
     
     public static boolean eliminarNotas(String id)
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
                String sql="delete from tbl_notaCurri where Id_nota="+id+"";               
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
     
     public static boolean agregarNotas(BeanNotas Usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    
 
    //campos de la tabla
    
    String sql="INSERT INTO tbl_notaCurri( id_alumno, id_curso, nota, unidad, id_tipo) VALUES ('"+Usuario.getId_alumno()+"','"+Usuario.getId_curso()+"','"+Usuario.getNota()+"','"+Usuario.getUnidad()+"', '"+1+"')";
    
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
     
      public static boolean agregarNotasExtra(BeanNotas Usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    
    
    //campos de la tabla
    String sql="INSERT INTO tbl_notaCurri(id_alumno, id_curso, nota, unidad, id_tipo) VALUES ('"+Usuario.getId_alumno()+"','"+Usuario.getId_curso()+"','"+Usuario.getNota()+"','"+Usuario.getUnidad()+"', '"+2+"')";
    
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

