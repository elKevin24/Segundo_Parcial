<%@page import="modelo.Usuario"%>
<%@page import="java.util.LinkedList"%>
<%@page import="controlador.BeanUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>

        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="menu.jsp" flush="true"></jsp:include>

            <title>Registro</title>
        </head>
<title>Consulta Usuario</title>
</head>
<body>
 <div class="col s12">

            <table border="1"   class="highlight responsive-table striped " >
                <tr>
                    <td>No.</td>
                    <td>Id</td>
                    <td>Lote</td>
                    <td>Fecha</td>
                    <td>Campo</td>
                    <td>Cantidad</td>
                    <td>Variedad</td>         
                    <td>Calidad Porcentaje</td>
                                  
                    
                </tr>
                <%
                    
                    String id = request.getParameter("usuario");
                    int  Lote = 2;
                    String b = String.valueOf(Lote);
                    LinkedList<BeanUsuario> lista = Usuario.consultarUsuarioLike(id);

                    for (int i = 0; i < lista.size(); i++) {

                        int a = i + 1;
                        out.println("<tr>");
                        out.println("<td>" + a + "</td>");
                        out.println("<td>" + lista.get(i).getId() + "</td>");
                        out.println("<td>" + lista.get(i).getLote()+ "</td>");
                        out.println("<td>" + lista.get(i).getFecha()+ "</td>");
                        out.println("<td>" + lista.get(i).getCampo() + "</td>");
                        out.println("<td>" + lista.get(i).getCantidad()+ "</td>");
                        out.println("<td>" + lista.get(i).getVariedad()+ "</td>");
                        out.println("<td>" + lista.get(i).getCalidad()+ "%</td>");
                        
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId() + ">" + "Editar" + "</a>" + "</td>");
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar.jsp?id=" + lista.get(i).getId() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");

                        out.println("</tr>");
                    }
                %>  

        </div>
</body>
</html>