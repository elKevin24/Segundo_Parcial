
package modelo;


import controlador.BeanNotasMalla;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class NotasMalla {
    
    
     public static LinkedList<BeanNotasMalla> consultarNotas() throws SQLException
{
     LinkedList<BeanNotasMalla> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_malla, procidimental, actitudinal, declarativo, id_nota, id_seccion, id_alumno, id_curso\n" +
"FROM tbl_malla" )) {
                    while (rs.next())
                    {
                        BeanNotasMalla user = new BeanNotasMalla();
                        user.setId_malla(rs.getString("id_malla"));
                        user.setProcidimental(rs.getString("procidimental"));
                        user.setActitudinal(rs.getString("actitudinal"));
                        user.setDeclarativo(rs.getString("declarativo"));
                        user.setId_nota(rs.getString("id_nota"));
                        user.setId_seccion(rs.getString("id_seccion"));
                        user.setId_alumno(rs.getString("id_alumno"));
                        user.setId_curso(rs.getString("id_curso"));
                         
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
     
     public static LinkedList<BeanNotasMalla> consultarNotasId(String id_seccion, String id_curso) throws SQLException
{
     LinkedList<BeanNotasMalla> usuarios = new LinkedList<>();
            
    try
      {
            Conexion c=new Conexion();
         try (Connection con = c.getConexion()) {
             Statement st;
             st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT  id_malla, ISnull(procedimental, '')as procedimental, ISnull(actitudinal, '')as actitudinal, ISnull(declarativo, '')as declarativo, id_nota, id_seccion, id_alumno, id_curso\n" +
"FROM tbl_malla where id_seccion="+id_seccion+" AND id_curso="+id_curso+"" )) {
                    while (rs.next())
                    {
                        BeanNotasMalla user = new BeanNotasMalla();
                        user.setId_malla(rs.getString("id_malla"));
                        user.setProcidimental(rs.getString("procedimental"));
                        user.setActitudinal(rs.getString("actitudinal"));
                        user.setDeclarativo(rs.getString("declarativo"));
                        user.setId_nota(rs.getString("id_nota"));
                        user.setId_seccion(rs.getString("id_seccion"));
                        user.setId_alumno(rs.getString("id_alumno"));
                        user.setId_curso(rs.getString("id_curso"));
                         
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
     
     public static boolean ActualizarNotas(BeanNotasMalla usuario)
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
                String sql="update tbl_malla set procedimental ='"+usuario.getProcidimental()+"',actitudinal='"+usuario.getActitudinal()+"', declarativo='"+usuario.getDeclarativo()+"' where Id_alumno="+usuario.getId_alumno()+"";
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
    

     public static BeanNotasMalla ObtenerNotas(String id)
{
    BeanNotasMalla user = new BeanNotasMalla();
    
     try
      {
    Conexion c=new Conexion();
        try (Connection con = c.getConexion()) {
            Statement st;
            st = con.createStatement();
        try (ResultSet rs = st.executeQuery("select * from tbl_nota where Id_nota="+id+"")) {
            while (rs.next())
            {
                
                user.setId_nota(rs.getString("Id_nota"));
                user.setId_alumno (rs.getString("Id_alumno"));
                user.setId_curso (rs.getString("Id_curso"));
               
                
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
                String sql="delete from tbl_nota where Id_nota="+id+"";               
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
     
     public static boolean agregarNotas(BeanNotasMalla Usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    //campos de la tabla
    String sql="INSERT INTO tbl_malla(procidimental, actitudinal, declarativo, id_nota, id_seccion, id_alumno, id_curso) VALUES ('"+Usuario.getProcidimental()+"','"+Usuario.getActitudinal()+"','"+Usuario.getDeclarativo()+"', '"+Usuario.getId_nota()+"','"+Usuario.getId_seccion()+"','"+Usuario.getId_alumno()+"','"+Usuario.getId_curso()+"')";
    
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
