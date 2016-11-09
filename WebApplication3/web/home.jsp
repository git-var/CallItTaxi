<%-- 
    Document   : home
    Created on : 3 Nov, 2016, 7:17:02 PM
    Author     : SONY
--%>

<%@page import="javax.jms.Session"%>
<%@page import="com.mvc.people.User"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="orderservlet">
            
            <p>Message for the day: ${param.message}</p>
            <center>
                <p>Type of taxi:<br>
                    <input type="radio" name="types" value="small" checked> Hatchback<br>
  <input type="radio" name="types" value="medium"> Sedan<br>
  <input type="radio" name="types" value="large"> SUV
                </p>
                <p>
                    From:<br><input type="text" name="from"></p>
                <p>To:<br><input type="text" name="to"></p
                <p> Time:<br><input type="text" name="time"></p>
                <p> Phno:<br><input type="text" name="phno"></p>
                <p> <input type="submit"></p>
            </center>
            </form>
        <form method="post" action="logoutservlet">
    <input type="submit" value="Logout"/>
</form>
            
    </body>
</html>
