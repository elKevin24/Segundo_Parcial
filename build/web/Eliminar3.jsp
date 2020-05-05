<%-- 
    Document   : Eliminar3
    Created on : 26/03/2019, 12:10:48 AM
    Author     : Ariel
--%>

<%@page import="modelo.Usuarios"%>
<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page import= "controlador.BeanUsuarios"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <%
           String id = request.getParameter("id");
           boolean res=false;
           if(id.length()>0)
           {
               res= Usuarios.eliminarUsuarios(id);
           }
   
           if(res==true)
           {
            out.println("<script> alert('Registro  eliminado')</script>");
              response.sendRedirect("http://localhost:8080/Proyecto/Notas.jsp");
               
           }
           else
           {
                out.println("<script> alert('Registro no eliminado')</script>");
               
           }

            
            
            
            
            %>
    </body>
    
    
</html>
