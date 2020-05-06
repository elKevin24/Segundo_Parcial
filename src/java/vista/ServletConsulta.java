package vista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controlador.BeanUsuario;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class ServletConsulta extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ServletConsulta() {
    }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String usuario=request.getParameter("usuario");
     LinkedList<BeanUsuario> busuario = null;
     try {
         busuario = Usuario.consultarUsuarioLike(usuario);
     } catch (SQLException ex) {
         Logger.getLogger(ServletConsulta.class.getName()).log(Level.SEVERE, null, ex);
     }
  if(busuario!=null){
   request.setAttribute("busuario", busuario);
   request.getRequestDispatcher("mostrar.jsp").forward(request, response);
  }else{
   PrintWriter out=response.getWriter();
   out.println("Error, no se encontro el usuario.");
  }
 }

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 }
}