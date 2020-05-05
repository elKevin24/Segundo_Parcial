<%-- 
    Document   : Seccion
    Created on : 28/03/2019, 06:51:55 PM
    Author     : Ariel
--%>

<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
    
     <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="menu.jsp" flush="true"></jsp:include>
      
        <title>Registro</title>
    </head>
    <body>
          
    <div class="nav-wrapper">
      <div class="col s12">
          <center> <h1>REGISTRO DE GRADO Y SECCION</h1></center>
        <a  href="index.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>
        
      </div>
        <form action="ServletSeccion.do" method="post" >
             <div class="row">
                 <div class="col s6">
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_seccion">
                          <label for="Id_seccion">Id_seccion</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Grado">
                          <label for="Grado">Grado</label>
                        </div>
                 
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Seccion">
                          <label for="Seccion">Seccion</label>
                        </div>
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_nivel">
                          <label for="Id_nivel">Id_nivel</label>
                        </div>
                                    
                 <div class="input-field col s3">
                   <input type="submit" value="Registrar" class="btn-large">

                   
                      
                  </div>
                 </div>
                 <div class="col s6">
                     <div class="col s6 offset-s3">
             <img class="responsive-img" src="IMG/LICEO.jpeg">
            </div>
                 </div>
           </div>
                    </form>
        
        
       <div class="col s6">
    
    <table border="1"   class="highlight responsive-table striped " >
    <tr>
    <td>No.</td>
    <td>Id_seccion</td>
    <td>Grado</td>
    <td>Seccion </td>
    <td>Id_nivel</td>   
  
  
    </tr>
        <%
        LinkedList<BeanSeccion> lista = Seccioon.consultarSeccion();
          
       
            
        for (int i=0;i<lista.size();i++)
        {
          
            int a=i+1;
           out.println("<tr>"); 
           out.println("<td>"+a+"</td>");
           out.println("<td>"+lista.get(i).getId_seccion()+"</td>");
           out.println("<td>"+lista.get(i).getGrado()+"</td>");
           out.println("<td>"+lista.get(i).getSeccion()+"</td>");
           out.println("<td>"+lista.get(i).getId_nivel()+"</td>");
           
           out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=EditarSeccion.jsp?id="+lista.get(i).getId_seccion()+">"+"Editar"+"</a>"+"</td>");
           out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=EliminarSeccion.jsp?id="+lista.get(i).getId_seccion()+">"+"<i class='material-icons'>delete_forever</i>"+"Eliminar"+"</a>"+"</td>");
         
            
           
           out.println("</tr>");
        }
        %>    
       </div>
      

        
    </body>
    
    
</html>
