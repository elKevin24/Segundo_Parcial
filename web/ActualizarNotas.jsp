<%-- 
    Document   : ActualizarNotas
    Created on : 27/03/2019, 11:50:46 PM
    Author     : Ariel
--%>

<%@page import="modelo.Notas"%>
<%@page import="controlador.BeanNotas"%>
<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nota Actualizada</title>
    </head>
    <body>
        
        <%
            
             boolean res=false;
             String Id_nota= request.getParameter("Id_nota");
             String Id_alumno = request.getParameter("Id_alumno");
             String Id_curso = request.getParameter("Id_curso");
             String Nota = request.getParameter("Nota");
             String Unidad = request.getParameter("Unidad");
             
             
             BeanNotas user = new BeanNotas();
             user.setId_nota(Id_nota);
             user.setId_alumno(Id_alumno);
             user.setId_curso(Id_curso);
             user.setNota(Nota);
             user.setUnidad(Unidad);
                          
             
             res=Notas.ActualizarNotas(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("GuardarNotas.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
          
        
        
    </body>
    
    
    
</html>
