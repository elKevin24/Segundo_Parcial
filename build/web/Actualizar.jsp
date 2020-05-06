<%-- 
    Document   : Actualizar.jsp
    Created on : 05-may-2018, 14:39:42
    Author     : nichodeveloper
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Usuario"%>
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
            String Lote = request.getParameter("Lote");
            String Fecha = request.getParameter("Fecha");
            String Campo = request.getParameter("Campo");
            String Cantidad = request.getParameter("Cantidad");
            String Variedad = request.getParameter("Variedad");
            String Calidad = request.getParameter("Calidad");

            BeanUsuario user = new BeanUsuario();
            user.setLote(Lote);
            user.setFecha(Fecha);
            user.setCampo(Campo);
            user.setCantidad(Cantidad);
            user.setVariedad(Variedad);
            user.setCalidad(Calidad);

            res = Usuario.ActualizarUsuario(user);
            if (res) {
                out.println("<script> alert('Registro  Actualizado')</script>");
                response.sendRedirect("http://localhost:8084/registroalumnoslc/Alumnos.jsp");

            } else {
                out.println("<script> alert('Error al actualizado el registro')</script>");
            }
        %>

    </body>

</html>
