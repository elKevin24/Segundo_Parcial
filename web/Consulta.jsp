<%-- 
    Document   : Consulta
    Created on : 21-abr-2018, 11:58:06
    Author     : nichodeveloper
--%>


<%@page import="java.util.ArrayList"%>
<%@ page import = "java.util.LinkedList"%>
<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "controlador.BeanUsuario"%> 
<%@ page import = "modelo.Usuario"%> 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
    
     <!--Import Google Icon Font-->
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   
   

                <jsp:include page="menu.jsp" flush="true"></jsp:include>

        <title>JSP Page</title>
    </head>
    <body>
        <img src="IMG/logo.png" alt="" width="150"/>
<h3>Consulta a base de datos</h3>
<a href="Consulta_report.jsp">imp</a>

<a class="btn-floating pulse" ><i class="material-icons">menu</i></a>


<button class="btn waves-effect waves-light" type="submit" name="action">Submit<i class="material-icons right">send</i>
  </button>
    <table border="1"   class="highlight responsive-table striped" >
    <tr>
    <td>No.</td>
    <td>Id_Alumno</td>
    <td>Apellido</td>
    <td>Segundo Apellido</td>
    <td>Nombre</td>
    <td>Segundo Nombre</td>
    <td>Tercer Nombre</td>
    <td>Grado</td>
  
  
    </tr>
        <%
        LinkedList<BeanUsuario> lista = Usuario.AlumnosGeneralActivos();
          
       
            
        for (int i=0;i<lista.size();i++)
        {
          
            int a=i+1;
           out.println("<tr>"); 
           out.println("<td>"+a+"</td>");
           out.println("<td>"+lista.get(i).getId_alumno()+"</td>");
           out.println("<td>"+lista.get(i).getApellido()+"</td>");
           out.println("<td>"+lista.get(i).getSapellido()+"</td>");
           out.println("<td>"+lista.get(i).getNombre()+"</td>");
           out.println("<td>"+lista.get(i).getSnombre()+"</td>");
           out.println("<td>"+ lista.get(i).getTnombre()+"</td>");
           out.println("<td>"+ lista.get(i).getId_seccion()+"</td>");
           
          
         
            
           
           out.println("</tr>");
        }
        %>        
          
        <a href="Consulta_report.jsp">report
        </a>
        
        
        <a href="index.jsp">Regresar </a>
        
        

        
        
    </body>
    <script>
  
   var elem = document.querySelector('.fixed-action-btn');
  var instance = M.FloatingActionButton.init(elem, {
    direction: 'left',
    hoverEnabled: false
  });
  
  
   
   </script>
   
</html>
