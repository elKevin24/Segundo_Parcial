<%-- 
    Document   : EliminarNotas
    Created on : 29/03/2019, 08:20:31 PM
    Author     : Ariel
--%>

<%@page import="modelo.Notas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
     <body>
        <%
           String id = request.getParameter("id");
           boolean res=false;
           if(id.length()>0)
           {
               res= Notas.eliminarNotas(id);
           }
   
           if(res==true)
           {
            out.println("<script> alert('Registro  eliminado')</script>");
              response.sendRedirect("Notas.jsp");
               
           }
           else
           {
                out.println("<script> alert('Registro no eliminado')</script>");
               
           }
         
            
         %>
    </body>
    
    
    
</html>
