
package modelo;
import controlador.BeanCurso;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.ResultSet;
import java.util.LinkedList;


public class Cursos {
 
public static LinkedList<BeanCurso> consultarCurso() throws SQLException
{
     LinkedList<BeanCurso> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_curso, nombredecurso, id_profesor, id_seccion\n" +
" from tbl_curso where status=1" )) {
                    while (rs.next())
                    {
                        BeanCurso user = new BeanCurso();
                        user.setId_curso(rs.getString("id_curso"));
                        user.setNombredecurso(rs.getString("nombredecurso"));
                        user.setId_profesor(rs.getString("id_profesor"));
                        user.setId_grado(rs.getString("id_seccion"));
                         
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

public static LinkedList<BeanCurso> consultarCursoTIPO(String id, String Id_seccion) throws SQLException
{
     LinkedList<BeanCurso> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_curso, nombredecurso, id_profesor, id_seccion\n" +
" from tbl_curso where status=1 AND id_tipo = "+id+" AND id_seccion = "+Id_seccion+"" )) {
                    while (rs.next())
                    {
                        BeanCurso user = new BeanCurso();
                        user.setId_curso(rs.getString("id_curso"));
                        user.setNombredecurso(rs.getString("nombredecurso"));
                        user.setId_profesor(rs.getString("id_profesor"));
                        user.setId_grado(rs.getString("id_seccion"));
                         
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

public static boolean ActualizarCurso(BeanCurso usuario)
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
                String sql="update tbl_curso set nombredecurso ='"+usuario.getNombredecurso()+"', Id_profesor='"+usuario.getId_profesor()+"', Id_seccion='"+usuario.getId_grado()+"' where Id_curso="+usuario.getId_curso()+"";
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


    
public static BeanCurso ObtenerCurso(String id)
{
    BeanCurso user = new BeanCurso();
    
     try
      {
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from tbl_curso where id_curso="+id+"");
            while (rs.next())
            {
                
                user.setId_curso(rs.getString("Id_curso"));
                user.setNombredecurso(rs.getString("nombredecurso"));
                user.setId_profesor(rs.getString("Id_profesor"));
                user.setId_grado(rs.getString("Id_seccion"));
                
                
                
            }
            rs.close();
            st.close();
        }
      }
     catch(SQLException e)
     {
     }
    return user;
    
}



public static boolean eliminarCurso(String id)
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
                String sql="update tbl_curso set status =0 where Id_curso="+id+"";               
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
    
 public static boolean agregarCurso(BeanCurso Alumno){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    //campos de la tabla
    String sql="INSERT INTO tbl_curso(id_curso, nombredecurso, id_profesor, id_grado) VALUES ('"+Alumno.getId_curso()+"','"+Alumno.getNombredecurso()+"','"+Alumno.getId_profesor()+"','"+Alumno.getId_grado()+"')";                                                                                           
   
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