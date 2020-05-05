<%-- 
    Document   : Usuarios
    Created on : 25/03/2019, 09:28:53 PM
    Author     : Ariel
--%>

<%@page import="controlador.BeanUsuarios"%>
<%@page import="modelo.Usuarios"%>
<%@page import="controlador.BeanUsuario"%>
<%@page import="java.util.LinkedList"%>
<%@page import="vista.ServletUsuarios"%>

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
          <center> <h1>REGISTRO DE USUARIOS</h1></center>
        <a  href="index.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>
        
      </div>
        <form action="ServletUsuarios.do" method="post" >
             <div class="row">
                 <div class="col s6">
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_usuario">
                          <label for="Id_usuario">Id_usuario</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Nombre">
                          <label for="Nombre">Nombre</label>
                        </div>
                 
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Apellido">
                          <label for="Apellido">Apellido</label>
                        </div>
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Contraseña">
                          <label for="Contraseña">Contraseña</label>
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
    <td>Id_usuario</td>
    <td>Nombre</td>
    <td>Apellido</td>
    <td>Contraseña</td>
        </tr>
        
    <%
        LinkedList<BeanUsuarios> lista= Usuarios.consultarUsuarios();
        
        for (int i=0;i<lista.size();i++)
        {
          
            int a=i+1;
            out.println("<tr>"); 
            out.println("<td>"+a+"</td>");
            out.println("<td>"+lista.get(i).getId_usuario()+"</td>");
            out.println("<td>"+lista.get(i).getNombre()+"</td>");
            out.println("<td>"+lista.get(i).getApellido()+"</td>");
            out.println("<td>"+lista.get(i).getContraseña()+"</td>");  
            out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar3.jsp?id="+lista.get(i).getId_usuario()+">"+"Editar"+"</a>"+"</td>");
            out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar3.jsp?id="+lista.get(i).getId_usuario()+">"+"<i class='material-icons'>delete_forever</i>"+"Eliminar"+"</a>"+"</td>");
    
        }    
    %>

       </div>
    </body>
    
    
</html>
