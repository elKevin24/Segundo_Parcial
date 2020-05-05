<%-- 
    Document   : GuardarNotas
    Created on : 27/03/2019, 11:36:45 PM
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

<META HTTP-EQUIV="REFRESH" CONTENT="2;URL=Notas.jsp"> </head> 
<body> 
<center> <h1>Nota Registrado</h1></center>
    <center> <img src="IMG/descarga.png" width="400" alt=""/> </center>
Hora: 
<script> 
miFecha = new Date() 
document.write(miFecha.getHours() + ":" + miFecha.getMinutes() + ":" + miFecha.getSeconds()) 
</script> 
</body> 
    
    
    
    
</html>
