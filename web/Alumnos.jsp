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

            String formParameter = request.getParameter("grado");
            if (formParameter == null) {

            } else {

                session.setMaxInactiveInterval(1000 * 5); // 5 minutes
                session.setAttribute("Id_grado", formParameter);

            }
            String grado = String.valueOf(session.getAttribute("Id_grado"));
            BeanSeccion user = new BeanSeccion();
            user = Seccioon.ObtenerSeccion(grado);

            out.println("<h4>Registro de Alumnos " + user.getGrado() + " Seccion " + user.getSeccion() + "</h4>");


        %>


        <div class="col s12">

            <a  href="grados.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>

        </div>
        <form action="ServletRegistro.do" method="post" >
            <div class="row">
                <div class="col s12">

                    <div class="input-field col s3">
                        <input type="text" size="20" name="Nombre">
                        <label for="Nombre"> Nombre</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Snombre">
                        <label for="Snombre">Segundo Nombre</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Tnombre">
                        <label for="Tnombre">Tercer Nombre</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Apellido">
                        <label for="Apellido">Apellido</label>
                    </div>
                    <div class="input-field col s3">
                        <input type="text" size="20" name="Sapellido">
                        <label for="Sapellido">Segundo Apellido</label>
                    </div>
                    <div class=" input-field col s1">
                        <input  type="text" size="20" name="Id_seccion" value="<%=grado%>"
                                <label for="Id_seccion">Codigo grado</label>
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
                    <td>Id_Alumno</td>
                    <td>Apellido</td>
                    <td>Segundo Apellido</td>
                    <td>Nombre</td>
                    <td>Segundo Nombre</td>
                    <td>Tercer Nombre </td>                        

                    <td>Seccion</td>

                </tr>
                <%
                    LinkedList<BeanUsuario> lista = Usuario.consultarUsuario();

                    for (int i = 0; i < lista.size(); i++) {

                        int a = i + 1;
                        out.println("<tr>");
                        out.println("<td>" + a + "</td>");
                       out.println("<td>" + lista.get(i).getId() + "</td>");
                        out.println("<td>" + lista.get(i).getLote()+ "</td>");
                        out.println("<td>" + lista.get(i).getFecha()+ "</td>");
                        out.println("<td>" + lista.get(i).getCampo() + "</td>");
                        out.println("<td>" + lista.get(i).getCalidad()+ "</td>");
                        out.println("<td>" + lista.get(i).getVariedad()+ "</td>");
                        out.println("<td>" + lista.get(i).getCalidad()+ "</td>");
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId() + ">" + "Editar" + "</a>" + "</td>");
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar.jsp?id=" + lista.get(i).getId() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");

                        out.println("</tr>");
                    }
                %>  

        </div>


    </body>
</html>
