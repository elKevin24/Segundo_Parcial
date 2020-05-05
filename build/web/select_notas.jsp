<%-- 
    Document   : newjsp
    Created on : 11/04/2019, 09:49:07 PM
    Author     : busqu
--%>

<%@page import="controlador.BeanSeccion"%>
<%@page import="modelo.Cursos"%>
<%@page import="controlador.BeanCurso"%>

<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Notas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>JSP Page</title>

        <script>
            function chg()
            {
                var val = document.getElementById('one').value;
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function ()
                {
                    if (xhttp.readyState === 4 && xhttp.status === 200)
                    {
                        document.getElementById('two').innerHTML = xhttp.responseText;
                    }
                };
                xhttp.open("POST", "NewServlet?valajax=" + val, true);
                xhttp.send();
            }
        </script>
    </head>

    <nav class="navbar navbar-light" style="background-color: #ff0000;">

        <a class="navbar-brand" href="index.jsp">LICEO CRISTIANO</a>
        <a class="navbar-brand" href="index.jsp">INICIO</a>

    </nav>
</div>  
</header>
<body>


<center>
    <%

        out.println("<h3>Seleccione Nivel Y  Grado </h3>");
        out.println("<img src='IMG/LICEO.jpeg' width='200'/>");

        out.println("<form action='malla.jsp' method='post'>");
    %>
    <table>

        <tr>
            <td> 
                <div class="select">
                    Seleccione el Nivel :                      
                    <select id="one" onchange="chg()">
                        <option> Select </option>
                        <option value="1">Preprimaria</option>
                        <option value="2">Primaria</option>
                        <option value="3">Basico</option>
                        <option value="4">Diversificado</option>


                    </select>
                </div>
            </td>
        </tr>


        <tr>
            <td>
                <div class="select1">
                    <div id="two">
                        Selecione el Grado : <select name="grado">

                        </select>
                    </div>
                </div>
            </td>
        </tr>

        <tr>
            <td>
                <%
                    out.println("<div >");
                    out.println("Seleccione Tipo Nota");
                    out.println("<select name='Id_curso'>");
                    out.println("<option disabled selected>Tipo de Nota</option>");

                    out.println("<option value='1'> Curricular</option>");
                    out.println("<option value='2'> Extra Curricular</option>");

                    out.println("</select>");
                    out.println("</div>");
                    out.println("<div >");
                     out.println("Seleccione Unidad");
                    out.println("<select name='unidad'>");
                    out.println("<option disabled selected>Unidad</option>");

                    out.println("<option value='1'> Primera Unidad</option>");
                    out.println("<option value='2'> Segunda Unidad</option>");
                    out.println("<option value='3'> Tercera Unidad</option>");
                    out.println("<option value='4'> Cuarta Unidad</option>");

                    out.println("</select>");
                    out.println("</div>");
                    out.println("<div class='abs-center' style='text-align: center;'> ");
                    out.println("<input ' type='submit' value='ACEPTAR' class='btn btn-primary'>");
                    out.println("'</div>'");
                    out.println("</form>");

                %>
            </td>
        </tr>

    </table>    

</body>
</html>
