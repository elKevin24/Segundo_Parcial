/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.BeanUsuario;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author nichodeveloper
 */
@WebServlet(name = "ServletRegistro", urlPatterns = {"/ServletRegistro.do"})
public class ServletRegistro extends HttpServlet {

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
        
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        try{
            try {
               
            } catch (Exception e) {
            }
        }finally{
            
        }
            

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
     
        String Lote = request.getParameter("Lote");
        String Fecha = request.getParameter("Fecha");
        String Campo = request.getParameter("Campo");
        String Cantidad = request.getParameter("Cantidad");
        String Variedad = request.getParameter("Variedad");
        String Calidad = request.getParameter("Calidad");
        
        BeanUsuario busuario;
        busuario = new BeanUsuario(Lote, Fecha, Campo, Cantidad,Variedad, Calidad);
        boolean sw = Usuario.agregarUsuario(busuario);

        PrintWriter out = response.getWriter();
        out.println( Lote+ Fecha+Cantidad+ Campo+Cantidad+Variedad+ Calidad );

        if (sw) {
            response.sendRedirect("Guardado.jsp");

        } else {

            out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
