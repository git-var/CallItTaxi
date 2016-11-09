<%-- 
    Document   : message
    Created on : 8 Nov, 2016, 10:49:42 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="messageservlet">
                <center>

            <p>Enter the message to send</p>
            <textarea cols="40" rows="5" name="msg"></textarea>
<input type="submit"/>
    </center>

        </form>
    </body>
</html>
