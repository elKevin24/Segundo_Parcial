<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


        <title>JSP Page</title>

        <script>
            function chg()
            {
                var val = document.getElementById('one').value;
                var xhttp= new XMLHttpRequest();
                xhttp.onreadystatechange=function ()
                {
                    if(xhttp.readyState===4 && xhttp.status===200)
                    {
                        document.getElementById('two').innerHTML=xhttp.responseText;
                    }
                };
                xhttp.open("POST","NewServlet?valajax="+val,true);
                xhttp.send();
            }
            </script>
             </head>
              
              <header>
                <div class="ancho">
		<nav class="navbar navbar-light" style="background-color: #ff0000;">
			
                          <a class="navbar-brand" href="index.jsp">LICEO CRISTIANO</a>
			 <a class="navbar-brand" href="index.jsp">INICIO</a>

		</nav>
		<nav>
			<ul>
				
			</ul>

		</nav>
            </div>  
              </header>
    <body>
         <center>
         <%

            out.println("<h3>Seleccione Nivel Y  Grado </h3>");
            out.println("<img src='IMG/LICEO.jpeg' width='200'/>");
         
            out.println("<form action='Alumnos.jsp' method='post'>");
        %>
        <table>

            <tr>
                <td> 
                      <div class="form-group">

                    <div class="select">
                    Seleccione el Nivel :                      
<select id="one" onchange="chg()">
                        <option> Select </option>
                       <option value="1">Preprimaria</option>
                    <option value="2">Primaria</option>
                    <option value="3">Basico</option>
                    <option value="4">Diversificado</option>
                        
                        
                    </select>
                    </div>
                      </div>
                </td>
            </tr>
           
            
            <tr>
                <td>
            <div class="select1">
                    <div id="two">
                Selecione el Grado : <select name="grado">
                    
                </select>
            </div>
            </div>
                    </td>
            </tr>
      
       
       
             </table>    
   <%
            out.println("<div class='abs-center' style='text-align: center;'> ");
            out.println("<input ' type='submit' value='ACEPTAR' class='btn btn-primary'>");
            out.println("'</div>'");
            out.println("</form>");
        
        %>
    </body>
</html>