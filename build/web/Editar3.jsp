<%-- 
    Document   : Editar3
    Created on : 25/03/2019, 11:44:45 PM
    Author     : Ariel
--%>

<%@page import="modelo.Usuarios"%>
<%@page import="controlador.BeanUsuarios"%>
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
               
               BeanUsuarios user = new BeanUsuarios();
               user = Usuarios.ObtenerUsuarios(id);
                
                 out.println("<h3>Modificación de Usuarios</h3>");
                 out.println("<img src='logo.png' width='100'/>");
                 out.println("<div class='row'>");            
                 out.println("<form action='Actualizar3.jsp' method='post'>");
                 out.println("<div class='row'>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Nombre' value="+user.getNombre()+">");
                 out.println("<input type='hidden' name='Id_usuario' value="+user.getId_usuario()+"");
                 out.println("<label for='Nombre de usuario'>Nombre de usuario</label>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Apellido' value="+user.getApellido()+">");
                 out.println("<label for='Apellido'>Apellido</label>");
                 out.println("</div>");
                 out.println("</div>");
                 out.println("<div class='input-field col s6'>");
                 out.println("<input type='text' size='20' name='Contraseña' value="+user.getContraseña()+">");
                 out.println("<label for='Contraseña'>Contraseña</label>");
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
