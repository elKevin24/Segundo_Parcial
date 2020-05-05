<%-- 
    Document   : ActualizarSeccion
    Created on : 28/03/2019, 07:14:32 PM
    Author     : Ariel
--%>

<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seccion Actualizada</title>
    </head>
    
    <body>
        
        <%
            
             boolean res=false;
             String Id_seccion= request.getParameter("Id_seccion");
             String Grado = request.getParameter("Grado");
             String Seccion = request.getParameter("Seccion");
             String Id_nivel = request.getParameter("Id_nivel");             
             
             BeanSeccion user = new BeanSeccion();
             user.setId_seccion(Id_seccion);
             user.setGrado(Grado);
             user.setSeccion(Seccion);
             user.setId_nivel(Id_nivel);
 
             
             res=Seccioon.ActualizarSeccion(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("http://localhost:8080/Proyecto/GuardarSeccion.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
 
    </body>
   
</html>
