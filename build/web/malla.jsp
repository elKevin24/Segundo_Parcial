<%-- 
    Document   : malla
    Created on : 29/04/2019, 12:57:31 PM
    Author     : busqu
--%>


<%@page import="controlador.BeanUsuarioNotas"%>
<%@page import="java.lang.String"%>
<%@page import="modelo.NotasMalla"%>
<%@page import="controlador.BeanNotasMalla"%>
<%@page import="controlador.BeanNotas"%>
<%@page import="modelo.Notas"%>
<%@page import="modelo.Cursos"%>
<%@page import="controlador.BeanCurso"%>
<%@page import="modelo.Seccioon"%>
<%@page import="controlador.BeanSeccion"%>
<%@page import="modelo.Usuario"%>
<%@page import="controlador.BeanUsuario"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<LINK REL=StyleSheet HREF="css/notascss.css" TYPE="text/css" MEDIA=screen>

    </head>
    <body> 
        <%

            String formParameter = request.getParameter("grado");
            String formParameter2 = request.getParameter("Id_curso");
            String formParameter3 = request.getParameter("unidad");
            if (formParameter == null) {

            } else {

                session.setMaxInactiveInterval(10000 * 5); // 5 minutes
                session.setAttribute("Id_grado", formParameter);
                session.setAttribute("Id_curso", formParameter2);
                session.setAttribute("unidad", formParameter3);

            }
            String grado = String.valueOf(session.getAttribute("Id_grado"));
            String curso = String.valueOf(session.getAttribute("Id_curso"));
            String unidad = String.valueOf(session.getAttribute("unidad"));
           
            BeanSeccion user = new BeanSeccion();
            user = Seccioon.ObtenerSeccion(grado);
            BeanCurso user2 = new BeanCurso();
            user2 = Cursos.ObtenerCurso(curso);
            BeanNotas user3 = new BeanNotas();

            out.println("<h3 align='center'>Registro de Notas " + user.getGrado() + " Seccion " + user.getSeccion() + " </br>"
                    + "Unidad  " + unidad + " curso "+ user2.getNombredecurso() + "</h1>");


        %>

 <nav class="navbar navbar-light" style="background-color: #ff0000;">
			
                          <a class="navbar-brand" href="select_notas.jsp">Atras</a>
			 <a class="navbar-brand" href="index.jsp">INICIO</a>

		</nav>
        <!--<form action="ServletNotas" method="post" > -->
        

        <table class="responsive-table highlight" >
            

            <%

                LinkedList<BeanUsuario> lista = Usuario.consultarUsuario2(grado);
                LinkedList<BeanNotas> lista2 = Notas.consultarNotas();

                LinkedList<BeanCurso> lista3 = Cursos.consultarCursoTIPO(curso,grado);

                out.println("<tr>");
                out.println("<th> No.</th>");
                out.println("<th> Clave</th>");
                out.println("<th> Nombre_del_Alumno </th>");

                for (int i = 0; i < lista3.size(); i++) {

                    out.println("<th name='" + lista3.get(i).getId_curso() + "' value='" + lista3.get(i).getId_curso() + "'>" + lista3.get(i).getNombredecurso() + "</th>");
                }

                out.println("</tr>");

                for (int i = 0; i < lista.size(); i++) {
                    int a = i + 1;
                    out.println("<form action='ServletNotasCurri' method='post' >");
                    out.println(" <input type='hidden' name='Id_Unidad' value='" + unidad + "' >");
                    out.println(" <input type='hidden' name='Id_tipo' value='" + curso + "' >");
                    out.println("<tr>");
                    out.println("<td>" + a + "</td>");
                    out.println("<td>" + lista.get(i).getId_alumno() + "</td>");

                    out.println("<td >" + lista.get(i).getNombre() + " " + lista.get(i).getSnombre() + " " + lista.get(i).getTnombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getSapellido() + "</td>");
                    for (int j = 0; j < lista3.size(); j++) {
                        user3 = Notas.ObtenerNotasCurso(lista.get(i).getId_alumno(), lista3.get(j).getId_curso(), unidad);
                        String Nota =  user3.getNota();
                        if (Nota == null){
                          Nota = " ";
                          out.println("<td ><input type='text' name='" + lista3.get(j).getId_curso() + "' value='" + Nota + "'>");
                        }else{
                            out.println("<td ><input disabled type='text' name='" + lista3.get(j).getId_curso() + "' value='" + Nota + "'>");
                        }
                         
                         
                        
                        out.println("<input  id='first_name' style='visibility:hidden' type='text' class='validate' size='1' value='" + lista3.get(j).getId_curso() + "' name='IDCurso" + j + "'></td>");
                    }
                    out.println("<input  id='first_name' style='visibility:hidden' type='text' class='validate' size='1' value='" + lista3.size() + "'name='Cantidad'>");
                    out.println("<input  id='first_name' style='visibility:hidden' type='text' class='validate' size='1' value='" + lista.get(i).getId_alumno() + "' name='IDAlumno'>");
                    out.println("<td><input type='submit' value='Registrar' class='btn-large' name='enviar'></td>");
                    out.println("</tr>");
                    out.println("</form>");
                                   

                }


            %>  

        </table>
        
           
         
    </body>
</html>