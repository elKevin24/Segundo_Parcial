<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="modelo.Grados"%>
<%@page import="controlador.BeanGrados"%>

<%-- 
    Document   : INICIAL
    Created on : 12/05/2018, 05:05:19 PM
    Author     : busqu
--%>


<%@page import="modelo.Usuarios"%>
<%@page import="controlador.BeanUsuarios"%>
<%@page import="java.util.*"%>
<%@page import="modelo.Usuario"%>
<%@page import="controlador.BeanUsuario"%>
<%@page import="vista.ServletRegistro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

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
        <body>

        <%

           

            out.println("<h4>Registro de Cafe </h4>");


        %>


        <div class="col s12">

            <a  href="grados.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>

        </div>
        <form action="ServletRegistro.do" method="post" >
            <div class="row">
                <div class="col s12">

                    <div class="input-field col s3">
                        <input type="text" size="20" name="Lote">
                        <label for="Lote"> Lote</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Fecha">
                        <label for="Fecha">Fecha</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Campo">
                        <label for="Campo">Campo</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Cantidad">
                        <label for="Cantidad">Cantidad</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Variedad">
                        <label for="Variedad">Variedad</label>
                    </div>
                    <div class=" input-field col s1">
                        <input type="text" size="20" name="Calidad">
                        <label for="Calidad">Calidad</label>
                        
                    </div>
                    <div class="input-field col s3">
                        <input type="submit" value="Registrar" class="btn-large" name="enviar">

                    </div>
                </div>
                <div class="col s6">
                    <div class="col s6 offset-s3">

                    </div>
                </div>

            </div>
        </form>


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
                    int  Lote = 2;
                    String b = String.valueOf(Lote);
                    LinkedList<BeanUsuario> lista = Usuario.consultarUsuario();

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
