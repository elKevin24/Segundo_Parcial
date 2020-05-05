<%-- 
    Document   : Actualizar.jsp
    Created on : 05-may-2018, 14:39:42
    Author     : nichodeveloper
--%>
<%@page import="modelo.NotasMalla"%>
<%@page import="controlador.BeanNotasMalla"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>

<%@page import="controlador.BeanUsuario"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario Actualizado</title>
    </head>

    <body>

        <%

            boolean res = false;
            String Id_nota = request.getParameter("Id_nota");
            String Id_alumno = request.getParameter("Id_alumno");
            String Id_curso = request.getParameter("Id_curso");
            String procidimental = request.getParameter("Procidimental");
            String actitudinal = request.getParameter("Actitudinal");
            String declarativo = request.getParameter("Declarativo");
            String Id_seccion = request.getParameter("Id_seccion");
            BeanNotasMalla user = new BeanNotasMalla();
            
            user.setProcidimental(procidimental);
            user.setActitudinal(actitudinal);
            user.setDeclarativo(declarativo);
            user.setId_seccion(Id_seccion);
            user.setId_nota(Id_nota);
            user.setId_alumno(Id_alumno);
            user.setId_curso(Id_curso);

            res = NotasMalla.ActualizarNotas(user);
            if (res) {
                out.println("<script> alert('Registro  Actualizado')</script>");
                response.sendRedirect("http://localhost:8084/Registro/Guardado.jsp");

            } else {
                out.println("<script> alert('Error al actualizado el registro')</script>");
            }


        %>

    </body>

</html>
