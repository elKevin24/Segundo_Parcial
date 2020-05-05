<%-- 
    Document   : Actualizar2
    Created on : 22/03/2019, 10:56:09 PM
    Author     : Ariel
--%>

<%@page import="modelo.Cursos"%>
<%@page import= "modelo.Cursos"%>
<%@page import="controlador.BeanCurso"%>
<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curso Actualizado</title>
    </head>
    <body>
        
        <%
            
             boolean res=false;
             String Id_curso= request.getParameter("Id_curso");
             String Nombredecurso = request.getParameter("Nombredecurso");
             String Id_profesor = request.getParameter("Id_profesor");
             String Id_grado = request.getParameter("Id_seccion");
            
             BeanCurso user = new BeanCurso();
             user.setId_curso(Id_curso);
             user.setNombredecurso(Nombredecurso);
             user.setId_profesor(Id_profesor);
             user.setId_grado(Id_grado);
             
             
             
             res=Cursos.ActualizarCurso(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("http://localhost:8084/Registro/Guardado2.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
          
        
        
    </body>
    
</html>
