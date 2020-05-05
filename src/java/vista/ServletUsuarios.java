/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controlador.BeanUsuarios;
import modelo.Usuarios;


/**
 *
 * @author Ariel
 */
@WebServlet(name = "ServletUsuarios", urlPatterns = {"/ServletUsuarios.do"})
public class ServletUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
         String Id_usuario=request.getParameter("Id_usuario");
         String Nombre=request.getParameter("Nombre");
         String Apellido=request.getParameter("Apellido");
         String Contraseña=request.getParameter("Contraseña");
        
         BeanUsuarios busuario;
         busuario = new BeanUsuarios(Id_usuario, Nombre, Apellido, Contraseña);
         boolean sw=Usuarios.agregarUsuarios(busuario);
         
         PrintWriter out=response.getWriter();
         out.println(Id_usuario+Nombre+ Apellido+Contraseña);
         
         if(sw){
                            response.sendRedirect("http:/registrodealumnos.com:8084/Registro/Guardado3.jsp");

              out.println("<script> alert('Curso Guardado')</script>");   
            

         }
         else
         {
         
          out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
         }
        
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
