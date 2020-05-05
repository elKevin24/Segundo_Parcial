<%-- 
    Document   : Actualizar.jsp
    Created on : 05-may-2018, 14:39:42
    Author     : nichodeveloper
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Usuario"%>
<%@page import="controlador.BeanUsuario"%> 
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
             String Encargado = request.getParameter("Encargado");
             String Telefono = request.getParameter("Telefono");
             String Correo = request.getParameter("Correo");
             String Id_alumno= request.getParameter("Id_alumno");
             String Nombre = request.getParameter("Nombre");
             String Snombre = request.getParameter("Snombre");
             String Tnombre = request.getParameter("Tnombre");
             String Apellido = request.getParameter("Apellido");             
             String Sapellido = request.getParameter("Sapellido");             
             String Id_seccion = request.getParameter("Id_seccion"); 
        
             BeanUsuario user = new BeanUsuario();
             user.setEncargado(Encargado);
             user.setTelefono(Telefono);
             user.setCorreo(Correo);
             user.setId_alumno(Id_alumno);
             user.setNombre(Nombre);
             user.setSnombre(Snombre);
             user.setTnombre(Tnombre);
             user.setApellido(Apellido);
             user.setSapellido(Sapellido);
             user.setId_seccion(Id_seccion);
             
             res=Usuario.ActualizarUsuario(user);
             if(res)
             {
              out.println("<script> alert('Registro  Actualizado')</script>");
              response.sendRedirect("http://localhost:8084/Registro/Guardado.jsp");
               
             }
             else
             {
                  out.println("<script> alert('Error al actualizado el registro')</script>");
             }
             
             
                    
              


         %>
 
    </body>
    
</html>
