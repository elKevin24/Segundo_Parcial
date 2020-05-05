<%-- 
    Document   : Cursos
    Created on : 22/03/2019, 05:19:42 PM
    Author     : Ariel
--%>

<%@page import="controlador.BeanCurso"%>
<%@page import="java.util.LinkedList"%>
<%@page import="vista.ServletCursos"%>
<%@page import="modelo.Cursos"%>
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
          <center> <h1>REGISTRO DE CURSOS</h1></center>
        <a  href="index.jsp" class="btn-floating pulse" ><i class="material-icons">arrow_back</i></a>
        
      </div>
        <form action="ServletCursos.do" method="post" >
             <div class="row">
                 <div class="col s6">
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_curso">
                          <label for="Id_curso">Id_Curso</label>
                        </div>
                        <div class="input-field col s3">
                            <input type="text" size="20" name="Nombredecurso">
                          <label for="Nombredecurso">Nombre del curso</label>
                        </div>
                 
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_profesor">
                          <label for="Id_profesor">Id_Profesor</label>
                        </div>
                 <div class="input-field col s3">
                            <input type="text" size="20" name="Id_grado">
                          <label for="Id_grado">Id_Grado</label>
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
    <td>Id_Curso</td>
    <td>Nombre del curso</td>
    <td>Id_Profesor</td>
    <td>Id_Grado</td>
        </tr>
        
    <%
        LinkedList<BeanCurso> lista= Cursos.consultarCurso();
        
        for (int i=0;i<lista.size();i++)
        {
          
            int a=i+1;
            out.println("<tr>"); 
            out.println("<td>"+a+"</td>");
            out.println("<td>"+lista.get(i).getId_curso()+"</td>");
            out.println("<td>"+lista.get(i).getNombredecurso()+"</td>");
            out.println("<td>"+lista.get(i).getId_profesor()+"</td>");
            out.println("<td>"+lista.get(i).getId_grado()+"</td>");  
            out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar2.jsp?id="+lista.get(i).getId_curso()+">"+"Editar"+"</a>"+"</td>");
            out.println("<td>"+"<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar2.jsp?id="+lista.get(i).getId_curso()+">"+"<i class='material-icons'>delete_forever</i>"+"Eliminar"+"</a>"+"</td>");
    
        }    
    %>

       </div>
    </body>
    
</html>
