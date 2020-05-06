package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Seccioon;
import controlador.BeanSeccion;
import modelo.Grados;
import controlador.BeanGrados;
import modelo.Usuarios;
import controlador.BeanUsuarios;
import java.util.*;
import modelo.Usuario;
import controlador.BeanUsuario;
import vista.ServletRegistro;

public final class Alumnos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <!-- Compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <title>Registro</title>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("        ");


           

            out.println("<h4>Registro de Cafe </h4>");


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("            <a  href=\"grados.jsp\" class=\"btn-floating pulse\" ><i class=\"material-icons\">arrow_back</i></a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <form action=\"ServletRegistro.do\" method=\"post\" >\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Lote\">\r\n");
      out.write("                        <label for=\"Lote\"> Lote</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Fecha\">\r\n");
      out.write("                        <label for=\"Fecha\">Fecha</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Campo\">\r\n");
      out.write("                        <label for=\"Campo\">Campo</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Cantidad\">\r\n");
      out.write("                        <label for=\"Cantidad\">Cantidad</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Variedad\">\r\n");
      out.write("                        <label for=\"Variedad\">Variedad</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\" input-field col s1\">\r\n");
      out.write("                        <input type=\"text\" size=\"20\" name=\"Calidad\">\r\n");
      out.write("                        <label for=\"Calidad\">Calidad</label>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-field col s3\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Registrar\" class=\"btn-large\" name=\"enviar\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col s6\">\r\n");
      out.write("                    <div class=\"col s6 offset-s3\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("            <table border=\"1\"   class=\"highlight responsive-table striped \" >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>No.</td>\r\n");
      out.write("                    <td>Id</td>\r\n");
      out.write("                    <td>Lote</td>\r\n");
      out.write("                    <td>Fecha</td>\r\n");
      out.write("                    <td>Campo</td>\r\n");
      out.write("                    <td>Cantidad</td>\r\n");
      out.write("                    <td>Variedad</td>         \r\n");
      out.write("                    <td>Calidad Porcentaje</td>\r\n");
      out.write("                                  \r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    int  Lote = 2;
                    String b = String.valueOf(Lote);
                    LinkedList<BeanUsuario> lista = Usuario.consultarUsuarioLike(b);

                    for (int i = 0; i < lista.size(); i++) {

                        int a = i + 1;
                        out.println("<tr>");
                        out.println("<td>" + a + "</td>");
                        out.println("<td>" + lista.get(i).getId() + "</td>");
                        out.println("<td>" + lista.get(i).getLote()+ "</td>");
                        out.println("<td>" + lista.get(i).getFecha()+ "</td>");
                        out.println("<td>" + lista.get(i).getCampo() + "</td>");
                        out.println("<td>" + lista.get(i).getCantidad()+ "</td>");
                        out.println("<td>" + lista.get(i).getVariedad()+ "</td>");
                        out.println("<td>" + lista.get(i).getCalidad()+ "%</td>");
                        
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction()' href=Editar.jsp?id=" + lista.get(i).getId() + ">" + "Editar" + "</a>" + "</td>");
                        out.println("<td>" + "<a class='waves-effect waves-light btn-small' onclick='return myFunction1()' href=Eliminar.jsp?id=" + lista.get(i).getId() + ">" + "<i class='material-icons'>delete_forever</i>" + "Eliminar" + "</a>" + "</td>");

                        out.println("</tr>");
                    }
                
      out.write("  \r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
