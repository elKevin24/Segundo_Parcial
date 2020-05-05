<%-- 
    Document   : paypal
    Created on : 21/05/2019, 11:55:29 PM
    Author     : busqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Compiled and minified CSS -->
   
   
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagos</title>
        
        
        
    </head>
    <body>
        <div align=" center">
        <h1 >pagos colegiatura</h1>
        <h2 >haga su pago por medio de paypal</h2>
        <div class="col s3 ">

        <table border="0" cellpadding="10" cellspacing="0" align="center">
            <tbody>
                <tr>
                    <td align="center"></td></tr>
                <tr><td align="center">
                        <a href="https://www.paypal.com/es/webapps/mpp/paypal-popup" title="Cómo funciona PayPal" 
                           onclick="">
                            <img align="center" src="https://www.paypalobjects.com/webstatic/mktg/logo/pp_cc_mark_111x69.jpg" border="0" alt="PayPal Logo" /></a></td></tr></tbody></table><!-- PayPal Logo -->
        
                        </div>
                        <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
            
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="BJ9N6U5FJBD66">
<input type="image" src="https://www.paypalobjects.com/webstatic/mktg/logo-center/logotipo_paypal_pagos_tarjetas.jpg" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.paypalobjects.com/es_XC/i/scr/pixel.gif" width="1" height="1">
</form>
       </div>

    </body>
</html>
