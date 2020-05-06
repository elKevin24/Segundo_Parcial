<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>

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
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="mostrar.jsp" method="get">
<table>
<tr>
<td colspan="2" align="center">Consultar Usuario</td>
</tr>
<tr>
<td>Usuario: </td>
<td><input type="text" size="15" name="usuario"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Consultar"></td>
</tr>
</table>
</form>
</div>
</body>
</html>