<%-- 
    Document   : EliminarSeccion
    Created on : 28/03/2019, 09:44:39 PM
    Author     : Ariel
--%>

<%@page import="modelo.Seccioon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
     <body>
        <%
           String id = request.getParameter("id");
           boolean res=false;
           if(id.length()>0)
           {
               res= Seccioon.eliminarSeccion(id);
           }
   
           if(res==true)
           {
            out.println("<script> alert('Registro  eliminado')</script>");
              response.sendRedirect("http://localhost:8080/Proyecto/Seccion.jsp");
               
           }
           else
           {
                out.println("<script> alert('Registro no eliminado')</script>");
               
           }
         
            
         %>
    </body>
    
    
</html>
