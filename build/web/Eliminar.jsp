<%-- 
    Document   : Eliminar
    Created on : 05-may-2018, 12:52:00
    Author     : nichodeveloper
--%>


<%@page import="controlador.BeanUsuario"%>
<%@page import="modelo.Usuario"%>
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
    
            <title>Eliminar alumno</title>
    </head>
    <body>
        
        
        <%
               
           String id = request.getParameter("id");
           boolean res=false;
           if(id.length()>0)
           {
               res= Usuario.CambiarEstado(id);
           }
   
           if(res==true)
           {
            out.println("<script> alert('Registro  eliminado')</script>");
              response.sendRedirect("http://localhost:8084/Registro/Alumnos.jsp");
               
           }
           else
           {
                out.println("<script> alert('Registro no eliminado')</script>");
               
           }
              
        %>
            
        
        
        
        
    </body>
    
  
    
</html>
