package modelo;

import controlador.BeanSeccion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Seccioon {

    public static LinkedList<BeanSeccion> consultarSeccion() throws SQLException {
        LinkedList<BeanSeccion> usuarios = new LinkedList<>();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("SELECT        id_seccion, grado, seccion, id_nivel\n"
                        + "FROM            dbo.tbl_seccion")) {
                    while (rs.next()) {
                        //BeanSeccion user = new BeanSeccion();
                        BeanSeccion user = new BeanSeccion();
                        user.setId_seccion(rs.getString("id_seccion"));
                        user.setGrado(rs.getString("grado"));
                        user.setSeccion(rs.getString("seccion"));
                        user.setId_nivel(rs.getString("id_nivel"));

                        usuarios.add(user);
                    }
                }
                st.close();
            }
        } catch (SQLException e) {
        }

        return usuarios;
    }

    public static boolean ActualizarSeccion(BeanSeccion usuario) {
        boolean actualizado = false;

        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                //UNA COMA ME HIZO DESVELARME HASTA LAS DOS DE LA MAÑANA
                String sql = "update tbl_seccion set grado ='" + usuario.getGrado() + "', seccion='" + usuario.getSeccion() + "', Id_nivel='" + usuario.getId_nivel() + "' where Id_seccion=" + usuario.getId_seccion() + "";

                st.execute(sql);
                actualizado = true;
                st.close();
            }

        } catch (SQLException e) {
            actualizado = false;
        }

        return actualizado;
    }

    public static BeanSeccion ObtenerSeccion(String id) {
        BeanSeccion user = new BeanSeccion();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select Id_seccion, Grado , ISnull(seccion, '')as Seccion, Id_nivel from tbl_seccion where Id_seccion=" + id + "")) {
                    while (rs.next()) {

                        user.setId_seccion(rs.getString("Id_seccion"));
                        user.setGrado(rs.getString("Grado"));
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
    
    public static BeanSeccion ObtenerSecciones(String id) {
        BeanSeccion user = new BeanSeccion();

        try {
            Conexion c = new Conexion();
            try (Connection con = c.getConexion()) {
                Statement st;
                st = con.createStatement();
                try (ResultSet rs = st.executeQuery("select * from tbl_seccion where Id_nivel=" + id + "")) {
                    while (rs.next()) {

                        user.setId_seccion(rs.getString("Id_seccion"));
                        user.setGrado(rs.getString("Grado"));
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
    
    

    public static boolean eliminarSeccion(String id) {
        boolean eliminado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                String sql = "delete from tbl_seccion where Id_seccion=" + id + "";
                st.execute(sql);
                eliminado = true;
                st.close();
            }

        } catch (SQLException e) {
            eliminado = false;
            e.printStackTrace();
        }

        return eliminado;
    }

    public static boolean agregarSeccion(BeanSeccion Alumno) {
        boolean agregado = false;
        try {
            Conexion c = new Conexion();
            Connection con = c.getConexion();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                //campos de la tabla
                String sql = "INSERT INTO tbl_seccion(id_seccion, grado, seccion, id_nivel) VALUES ('" + Alumno.getId_seccion() + "','" + Alumno.getGrado() + "','" + Alumno.getSeccion() + "','" + Alumno.getId_nivel() + "')";

                System.out.println(sql);
                st.execute(sql);

                agregado = true;
                st.close();
            }

        } catch (SQLException e) {
            agregado = false;
            e.printStackTrace();
        }
        return agregado;
    }
}
