/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.BeanSeccion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Seccioon;

/**
 *
 * @author Ariel
 */
@WebServlet(name = "ServletSeccion", urlPatterns = {"/ServletSeccion.do"})
public class ServletSeccion extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletSeccion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSeccion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException     
   {
         String Id_seccion=request.getParameter("Id_seccion");
         String Grado=request.getParameter("Grado");
         String Seccion=request.getParameter("Seccion");
         String Id_nivel=request.getParameter("Id_nivel");
        
         BeanSeccion busuario;
         busuario = new BeanSeccion(Id_seccion, Grado, Seccion, Id_nivel);
         boolean sw=Seccioon.agregarSeccion(busuario);
         
         PrintWriter out=response.getWriter();
         out.println(Id_seccion+Grado+ Seccion+Id_nivel);
         
         if(sw){
                            response.sendRedirect("http://registrodealumnos.com:8084/Registro/GuardarSeccion.jsp");

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
