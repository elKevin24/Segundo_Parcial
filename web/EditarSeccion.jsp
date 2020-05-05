<%-- 
    Document   : EditarSeccion
    Created on : 28/03/2019, 07:11:39 PM
    Author     : Ariel
--%>

<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
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
               
               BeanSeccion user = new BeanSeccion();
               user = Seccioon.ObtenerSeccion(id);
                
                 out.println("<h3>Modificación de Notas</h3>");
                 out.println("<img src='logo.png' width='100'/>");
                 out.println("<div class='row'>");            
                 out.println("<form action='ActualizarSeccion.jsp' method='post'>");
                 out.println("<div class='row'>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Grado' value="+user.getGrado()+">");
                 out.println("<input type='hidden' name='Id_seccion' value="+user.getId_seccion()+"");
                 out.println("<label for='Grado'>Grado</label>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Seccion' value="+user.getSeccion()+">");
                 out.println("<label for='Seccion'>Seccion</label>");
                 out.println("</div>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Id_nivel' value="+user.getId_nivel()+">");
                 out.println("<label for='Id_nivel'>Id_nivel</label>");
                 out.println("</div>");
                                         
                
                 out.println("</div>");
                 
                 out.println("<div class='row'>");
                 out.println("<input type='submit' value='Actualizar' class='btn-large'>");
                 
                 out.println("<a href='Seccion.jsp' value='Regresar' class='btn-large'>Regresar</a>");
                 
                 out.println("'</div>'");
                 
                 out.println("</form>");
                 out.println("</div>");
                


                



        %>
            
        
        
        
        
    </body>
    
    
</html>
