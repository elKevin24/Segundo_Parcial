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
import modelo.Notas;

/**
 *
 * @author Ariel
 */
@WebServlet(name = "ServletNotas", urlPatterns = {"/ServletNotas.do"})
public class ServletNotas extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       
        String Id_alumno = request.getParameter("Id_alumno");
        String Id_curso = request.getParameter("Id_curso");
        String Nota = request.getParameter("Nota");
        String Unidad = request.getParameter("Unidad");

        BeanNotas busuario;
        busuario = new BeanNotas(Id_alumno, Id_curso,  Nota, Unidad);
        boolean sw = Notas.agregarNotas(busuario);

        PrintWriter out = response.getWriter();
        out.println(Id_alumno + Id_curso + Nota + Unidad);

        if (sw) {
            response.sendRedirect("GuardarNotas.jsp");

            out.println("<script> alert('Alumno Guardado')</script>");

        } else {

            out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
