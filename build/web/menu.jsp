<%-- 
    Document   : index
    Created on : 21/05/2018, 12:12:11 PM
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/jpeg" href="IMG/LICEO.jpeg" />

        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
         <link href="/your-path-to-fontawesome/css/all.css" rel="stylesheet">
    </head>

    <body>
        <nav>
            <div class="nav-wrapper">
                <div class="blue-grey darken-1 red-text text-darken-2"


                     <a href="#!" class="brand-logo">.</a>

                    <ul class="right hide-on-med-and-down"> 
                        
                        <li><a href="Login.jsp">Salir</a></li>
                    </ul>


                    <ul id="slide-out" class="sidenav">
                      <li><div class="user-view">
      <div class="background">
        <img src="IMG/logo3.jpg">
      </div>
      <a href="#user"><img class="circle" src="IMG/LICEO.jpeg"></a>
      <a href="#name"><span class="white-text name">LICEO CRISTIANO</span></a>
      <a href="#email"><span class="white-text email">liceocristiano@gmail.com</span></a>
    </div></li>
                        <li><a class="subheader">Registro</a></li>
                        <ul class="collapsible collapsible-accordion">
                            <li>
                                <a class="collapsible-header">Alumnos<i class="material-icons">account_boxarrow_drop_down</i></a>
                                <div class="collapsible-body">
                                    <ul>
                                        <li><a href="newjsp.jsp">Ingreso</a></li>
                                        <li><a href="Consulta.jsp">Consulta</a></li>
                                        <li><a href="Reporte.jsp">Rerpote</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li>
                                <a class="collapsible-header">Cursos<i class="material-icons">collections_bookmark</i></a>
                                <div class="collapsible-body">
                                    <ul>

                                        <li><a href="Cursos.jsp">Ingreso</a></li>




                                    </ul>
                                </div>
                            </li>
                            <li><a class="collapsible-header">Notas<i class="material-icons">people</i></a>
                                <div class="collapsible-body">
                                    <ul>
                                        <li><a href="Notas.jsp">Ingreso V1</a></li>
                                        <li><a href="select_notas.jsp">Ingreso</a></li>

                                    </ul>
                                </div>
                            </li>
                             <li><a class="collapsible-header">Premios<i class="material-icons">star_border</i></a>
                                <div class="collapsible-body">
                                    <ul>
                                        <li><a href="ward.jsp">Gafetes</a></li>
                                        

                                    </ul>
                                </div>
                            </li>


                        </ul>

                    </ul>

                    <a href="#" data-target="slide-out" class="sidenav-trigger show-on-large"><i class="material-icons">menu</i></a>
                </div>
            </div>





        </nav>

    </body>

    <script>

        var elems = document.querySelectorAll('.sidenav');
        var instances = M.Sidenav.init(elems, {
            direction: 'left',
            hoverEnabled: false
        });
        var collapsibleElem = document.querySelector('.collapsible');
        var collapsibleInstance = M.Collapsible.init(collapsibleElem, {
            direction: 'left',
            hoverEnabled: false
        });

        $(document).ready(function () {
            $('.sidenav').sidenav();
        });
    </script>
</html>
