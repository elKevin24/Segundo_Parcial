<%-- 
    Document   : Editar
    Created on : 05-may-2018, 12:51:49
    Author     : nichodeveloper
--%>



<%@ page import="controlador.BeanUsuario"%> 
<%@ page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <title>Modificacion de datos</title>
    </head>
    <body>


        <%
            String id = request.getParameter("id");

            BeanUsuario user = new BeanUsuario();
            user = Usuario.ObtenerUsuario(id);

            out.println("<h3>Modificación de alumno</h3>");
            out.println("<img src='logo.png' width='100'/>");
            out.println("<div class='row'>");
            out.println("<form action='Actualizar.jsp' method='post'>");
            out.println("<div class='row'>");
            out.println("<div class='input-field col s4'>");
            out.println("<input type='text' size='20' name='Lote' value=" + user.getLote() + ">");
            out.println("<label for='Lote'>Lote</label>");
            out.println("</div>");
            out.println("<div class='input-field col s4'>");
            out.println("<input type='text' size='20' name='Fecha' value=" + user.getFecha() + ">");
            out.println("<label for='Fecha'>Fecha</label>");
            out.println("</div>");
            out.println("<div class='input-field col s4'>");
            out.println("<input type='text' size='20' name='Campo' value=" + user.getCampo() + ">");
            out.println("<label for='Campo'>Campo</label>");
            out.println("</div>");
            out.println("<div class='input-field col s6'>");
            out.println("<input type='text' size='20' name='Cantidad' value=" + user.getCantidad() + ">");
            out.println("<label for='Cantidad'>Cantidad</label>");
            out.println("</div>");
            out.println("<div class='input-field col s6'>");
            out.println("<input type='text' size='20' name='Variedad' value=" + user.getVariedad() + ">");
            out.println("<label for='Variedad'>Variedad</label>");
            out.println("</div>");
            out.println("<div class='input-field col s6'>");
            out.println("<input type='text' size='20' name='Calidad' value=" + user.getCalidad() + ">");
            out.println("<input type='hidden' name='Id' value=" + user.getId() + "");
            out.println("<label for='Calidad'>Calidade</label>");
            out.println("</div>");

            out.println("<div class='input-field col s3'>");
            out.println("<input type='text' size='20'  disabled value=" + user.getId() + ">");
            out.println("<label for=''>Id</label>");
            out.println("</div>");
            out.println("<div class='row'>");
            out.println("<input type='submit' value='Actualizar' class='btn-large'>");
            out.println("<a href='Alumnos.jsp' value='Regresar' class='btn-large'>Regresar</a>");
            out.println("'</div>'");
            out.println("</form>");
            out.println("</div>");


        %>





    </body>
</html>
