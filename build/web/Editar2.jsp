<%-- 
    Document   : Editar2
    Created on : 22/03/2019, 10:35:28 PM
    Author     : Ariel
--%>

<%@page import="modelo.Cursos"%>
<%@page import="controlador.BeanCurso"%>
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
               
               BeanCurso user = new BeanCurso();
               user = Cursos.ObtenerCurso(id);
                
                 out.println("<h3>Modificación de Cursos</h3>");
                 out.println("<img src='logo.png' width='100'/>");
                 out.println("<div class='row'>");            
                 out.println("<form action='Actualizar2.jsp' method='post'>");
                 out.println("<div class='row'>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Nombredecurso' value="+user.getNombredecurso()+">");
                 out.println("<input type='hidden' name='Id_curso' value="+user.getId_curso()+"");
                 out.println("<label for='Nombre de curso'>Nombre de curso</label>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Id_profesor' value="+user.getId_profesor()+">");
                 out.println("<label for='Id_profesor'>Id_profesor</label>");
                 out.println("</div>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Id_seccion' value="+user.getId_grado()+">");
                 out.println("<label for='Id_grado'>Id_grado</label>");
                 out.println("</div>");
                 
                 
                                  
                
                 out.println("</div>");
                 
                 out.println("<div class='row'>");
                 out.println("<input type='submit' value='Actualizar' class='btn-large'>");
                 
                 out.println("<a href='index.jsp' value='Regresar' class='btn-large'>Regresar</a>");
                 
                 out.println("'</div>'");
                 
                 out.println("</form>");
                 out.println("</div>");
                


                



        %>
            
        
        
        
        
    </body>
    
</html>
