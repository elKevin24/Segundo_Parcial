<%-- 
    Document   : Guardado3
    Created on : 25/03/2019, 11:38:40 PM
    Author     : Ariel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head> 
    <link href="https://fonts.googleapis.com/css?family=Playball" rel="stylesheet">
<style>
    body {
        font-family: 'Playball', cursive;

    }
  </style>
  <title>Refrescar la URL</title> 

<META HTTP-EQUIV="REFRESH" CONTENT="2;URL=Usuarios.jsp"> </head> 
<body> 
<center> <h1>Usuario Registrado</h1></center>
    <center> <img src="IMG/descarga.png" width="400" alt=""/> </center>
Hora: 
<script> 
miFecha = new Date() 
document.write(miFecha.getHours() + ":" + miFecha.getMinutes() + ":" + miFecha.getSeconds()) 
</script> 
</body>  
    
    
    
</html>
