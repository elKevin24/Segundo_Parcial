<%-- 
    Document   : EditarNotas
    Created on : 27/03/2019, 11:39:49 PM
    Author     : Ariel
--%>

<%@page import="modelo.Notas"%>
<%@page import="controlador.BeanNotas"%>

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
               
               BeanNotas user = new BeanNotas();
               user = Notas.ObtenerNotas(id);
                
                 out.println("<h3>Modificación de Notas</h3>");
                 out.println("<img src='logo.png' width='100'/>");
                 out.println("<div class='row'>");            
                 out.println("<form action='ActualizarNotas.jsp' method='post'>");
                 out.println("<div class='row'>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Id_alumno' value="+user.getId_alumno()+">");
                 out.println("<input type='hidden' name='Id_nota' value="+user.getId_nota()+"");
                 out.println("<label for='Id_alumno'>Id_alumno</label>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Id_curso' value="+user.getId_curso()+">");
                 out.println("<label for='Id_curso'>Id_curso</label>");
                 out.println("</div>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Nota' value="+user.getNota()+">");
                 out.println("<label for='Nota'>Nota</label>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Unidad' value="+user.getUnidad()+">");
                 out.println("<label for='Unidad'>Unidad</label>");
                 out.println("</div>");
                 
                 
                 
                                  
                
                 out.println("</div>");
                 
                 out.println("<div class='row'>");
                 out.println("<input type='submit' value='Actualizar' class='btn-large'>");
                 
                 out.println("<a href='Notas.jsp' value='Regresar' class='btn-large'>Regresar</a>");
                 
                 out.println("'</div>'");
                 
                 out.println("</form>");
                 out.println("</div>");
                


                



        %>
            
        
        
        
        
    </body>
    
    
    
</html>
