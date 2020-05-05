<%-- 
    Document   : Eliminar2
    Created on : 23/03/2019, 10:38:00 AM
    Author     : Ariel
--%>

<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page import="modelo.Cursos"%>
<%@ page import = "controlador.BeanCurso"%> 
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
               res= Cursos.eliminarCurso(id);
           }
   
           if(res==true)
           {
            out.println("<script> alert('Registro  eliminado')</script>");
              response.sendRedirect("http://localhost:8084/Registro/Cursos.jsp");
               
           }
           else
           {
                out.println("<script> alert('Registro no eliminado')</script>");
               
           }
            
            %>
    </body>
    
</html>
