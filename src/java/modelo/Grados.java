package modelo;

import controlador.BeanGrados;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grados {

    public static LinkedList<BeanGrados> consultarGrados() throws SQLException {
        LinkedList<BeanGrados> usuarios = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_seccion, grado, ISnull(seccion, '')as seccion, status, id_nivel from  tbl_seccion")) {
                    while (rs.next()) {
                        BeanGrados user = new BeanGrados();
                        user.setId_seccion(rs.getString("Id_seccion"));
                        user.setGrado(rs.getString("Grado"));
                        user.setSeccion(rs.getString("Seccion"));
                        user.setStatus(rs.getString("Status"));
                        user.setId_nivel(rs.getString("Id_nivel"));

                        usuarios.add(user);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return usuarios;
    }
    
    public static LinkedList<BeanGrados> consultarGrados2(int a) throws SQLException {
        LinkedList<BeanGrados> usuarios = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select id_seccion, grado, ISnull(seccion, '')as seccion from  tbl_seccion where id_nivel = "+a+"")) {
                    while (rs.next()) {
                        BeanGrados user = new BeanGrados();
                        user.setId_seccion(rs.getString("Id_seccion"));
                        user.setGrado(rs.getString("Grado"));
                        user.setSeccion(rs.getString("Seccion"));
                       

                        usuarios.add(user);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return usuarios;
    }

    public static boolean ActualizarGrado(BeanGrados usuario) {
        boolean actualizado = false;

        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                //UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql = "update tbl_seccion set  Grado ='" + usuario.getGrado() + "',Seccion ='" + usuario.getSeccion() + "',Status ='" + usuario.getStatus() + "'";
                st.execute(sql);
                actualizado = true;
                st.close();
            }

        } catch (SQLException e) {
            actualizado = false;
        }

        return actualizado;
    }

    public static BeanGrados ObtenerGrados(String id) {
        BeanGrados user = new BeanGrados();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select * from tbl_seccion  where Id_seccion=" + id + "")) {
                    while (rs.next()) {

                        user.setId_seccion(rs.getString("Id_Seccion"));
                        user.setGrado(rs.getString("Grados"));
                        user.setSeccion(rs.getString("Seccion"));
                        user.setId_nivel(rs.getString("Id_nivel"));

                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }
        return user;

    }

    public static BeanGrados ObtenerNiveles(String id) {
        BeanGrados user = new BeanGrados();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT dbo.tbl_seccion.id_seccion, dbo.tbl_seccion.grado FROM dbo.tbl_nivel INNER JOIN  dbo.tbl_seccion ON dbo.tbl_nivel.id_nivel = dbo.tbl_seccion.id_nivel WHERE dbo.tbl_nivel.id_nivel=" + id + "")) {
                    while (rs.next()) {

                        user.setId_nivel1(rs.getString("id_nivel"));
                        user.setNombre_nivel(rs.getString("nombre_nivel"));
                        user.setStatus1(rs.getString("status"));

                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }
        return user;

    }

    public static boolean eliminarUsuario(String id) {
        boolean eliminado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                String sql = "update tbl_seccion set status = 0 where id_seccion =" + id + "";
                st.execute(sql);
                eliminado = true;
                st.close();
            }

        } catch (SQLException e) {
            eliminado = false;
        }

        return eliminado;
    }

    public static boolean agregarUsuario(BeanGrados Alumno) {
        boolean agregado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                //campos de la tabla
                String sql = "INSERT INTO tbl_seccion(id_seccion , grado, seccion, id_nivel) VALUES ('" + Alumno.getId_seccion() + "','" + Alumno.getGrado() + "','" + Alumno.getSeccion() + "','" + Alumno.getId_nivel() + "')";

                System.out.println(sql);
                st.execute(sql);

                agregado = true;
                st.close();
            }

        } catch (SQLException e) {
            agregado = false;
        }
        return agregado;
    }

}
