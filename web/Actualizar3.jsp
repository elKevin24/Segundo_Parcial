<%-- 
    Document   : Actualizar3
    Created on : 25/03/2019, 11:51:15 PM
    Author     : Ariel
--%>

<%@page import="modelo.Usuarios"%>
<%@page import="controlador.BeanUsuarios"%>
<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario Actualizado</title>
    </head>
    <body>
        
        <%
            
             boolean res=false;
             String Id_usuario= request.getParameter("Id_usuario");
             String Nombre = request.getParameter("Nombre");
             String Apellido = request.getParameter("Apellido");
             String Contraseña = request.getParameter("Contraseña");
            
             BeanUsuarios user = new BeanUsuarios();
             user.setId_usuario(Id_usuario);
             user.setNombre(Nombre);
             user.setApellido(Apellido);
             user.setContraseña(Contraseña);
             
             
             
             res=Usuarios.ActualizarUsuarios(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("http://localhost:8080/Proyecto/Guardado3.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
          
         
    </body>
    
    
</html>
