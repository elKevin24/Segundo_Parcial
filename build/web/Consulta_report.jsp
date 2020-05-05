<%-- 
    Document   : Consulta_report
    Created on : 22-ene-2020, 14:56:43
    Author     : busqu
--%>


<%@page import="net.sf.jasperreports.view.JasperViewer"%>
<%@page import="net.sf.jasperreports.export.SimplePdfExporterConfiguration"%>
<%@page import="net.sf.jasperreports.export.SimpleOutputStreamExporterOutput"%>
<%@page import="net.sf.jasperreports.export.SimpleExporterInput"%>
<%@page import="net.sf.jasperreports.engine.export.JRPdfExporter"%>
<%@page import="net.sf.jasperreports.engine.xml.JRXmlLoader"%>
<%@page import="net.sf.jasperreports.engine.design.JasperDesign"%>
<%@page contentType="application/pdf" %>
<%@page trimDirectiveWhitespaces="true" %>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="java.sql.*"%>
<%@page import=" modelo.Conexion"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           Connection con = null;
        try {
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_proyecto;"+
           "user=sa;"+"password=1234");
   //jdbc:sqlserver://localhost:1433;databaseName=db_proyecto [sa on dbo]
  
  } 
  catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch bloc

  }JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\kev\\Documents\\registroalumnoslc\\src\\java\\ALUMNOS.jasper", null,
                    con);
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("ReporteAlumnos.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\kev\\Documents\\registroalumnoslc\\src\\java\\ALUMNOS.jasper", null,
                    con);
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
            
            

        InputStream input = new FileInputStream(new File("C:\\Users\\kev\\Documents\\registroalumnoslc\\src\\java\\ALUMNOS.jrxml"));
 
        //Generating the report
 
        JasperReport jasperReport = JasperCompileManager.compileReport(input);
        JasperPrint jasperPrint1 = JasperFillManager.fillReport(jasperReport, null, con);
 
        //Exporting the report as a PDF
 
        JasperExportManager.exportReportToPdfStream(jasperPrint1, response.getOutputStream());
 
 



            
        if(con == null){
                con.close();
        }
        
        %>
    </body>
</html>
