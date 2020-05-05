/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.BeanNotasMalla;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.NotasMalla;


/**
 *
 * @author Ariel
 */
@WebServlet(name = "ServletNotasMalla", urlPatterns = {"/ServletNotasMalla.do"})
public class ServletNotasMalla extends HttpServlet {

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
         String Id_malla = "hola";
         String Id_nota=request.getParameter("Id_nota");
         String Id_alumno=request.getParameter("Id_alumno");
         String Id_curso=request.getParameter("Id_curso");
         String procidimental=request.getParameter("P1");
         String actitudinal=request.getParameter("A1");
         String declarativo =request.getParameter("D3");
         String Id_seccion = request.getParameter("Id_seccion");
         BeanNotasMalla busuario = new BeanNotasMalla(Id_malla,Id_nota, Id_seccion, Id_alumno, Id_curso,procidimental, actitudinal, declarativo);
         boolean sw=NotasMalla.agregarNotas(busuario);

         PrintWriter out=response.getWriter();
         out.println(Id_nota+ Id_alumno+ Id_curso+ procidimental+ actitudinal+ declarativo);

         
         if(sw){
                            response.sendRedirect("http://registrodealumnos.com:8084/Registro/malla.jsp");

             out.println("<script> alert('Alumno Guardado')</script>");   
            

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
