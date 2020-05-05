/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.BeanNotas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static modelo.Notas.agregarNotas;
import static modelo.Notas.agregarNotasExtra;

/**
 *
 * @author busqu
 */
@WebServlet(name = "ServletNotasCurri", urlPatterns = {"/ServletNotasCurri"})
public class ServletNotasCurri extends HttpServlet {

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
            out.println("<title>Servlet ServletNotasCurri</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Notash at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String Id_tipo = request.getParameter("Id_tipo");
        int a = Integer.parseInt(Id_tipo);
        System.out.println("este es  " + Id_tipo);
        if (a == 1) {
            boolean b = false;
            PrintWriter out = response.getWriter();
            BeanNotas A;
            String Id_unidad = request.getParameter("Id_Unidad");

            String id = request.getParameter("IDAlumno");                   //Aqui tenes el ID del Alumno
            int cant = Integer.parseInt(request.getParameter("Cantidad"));
            int sum = Integer.parseInt(request.getParameter("IDCurso0"));
            String[] Curso = new String[cant];
            String[] Notas = new String[cant];
            for (int i = 0; i < cant; i++) {
                Curso[i] = request.getParameter("IDCurso" + i + "");

            }
            for (int i = 0; i < cant; i++) {
                int k = i + sum;
                Notas[i] = request.getParameter("" + k + "");

                //Aqui vas obteniendo el id del curso
            }
            for (int i = 0; i < cant; i++) {
                A = new BeanNotas(id, Curso[i], Notas[i], Id_unidad);
                b = agregarNotas(A);
                out.println(id + Curso[i] + Notas[i] + Id_unidad);

            }

            if (b) {
                response.sendRedirect("malla.jsp");

            } else {

                out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
            }
        } else if (a == 2) {
            boolean b = false;
            PrintWriter out = response.getWriter();
            BeanNotas A;
            String Id_unidad = request.getParameter("Id_Unidad");

            String id = request.getParameter("IDAlumno");                   //Aqui tenes el ID del Alumno
            int cant = Integer.parseInt(request.getParameter("Cantidad"));
            int sum = Integer.parseInt(request.getParameter("IDCurso0"));
            String[] Curso = new String[cant];
            String[] Notas = new String[cant];
            for (int i = 0; i < cant; i++) {
                Curso[i] = request.getParameter("IDCurso" + i + "");
                System.err.println("este es idcurso " + i);//Aqui vas obteniendo el id del curso
            }
            for (int i = 0; i < cant; i++) {
                int k = i + sum;
                Notas[i] = request.getParameter("" + k + "");
                System.err.println("este es k " + k);
                //Aqui vas obteniendo el id del curso
            }
            for (int i = 0; i < cant; i++) {
                A = new BeanNotas(id, Curso[i], Notas[i], Id_unidad);
                b = agregarNotasExtra(A);
                out.println(id + Curso[i] + Notas[i] + Id_unidad);

            }

            if (b) {
                response.sendRedirect("malla.jsp");

            } else {

                out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
            }

        }

//Solo es de que obtengas lo que introducen en los inputs(la nota de cada curso) y hacer el metodo
        // para meterlo a la base de datos
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
