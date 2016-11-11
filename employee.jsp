<%-- 
    Document   : employee
    Created on : 5 Nov, 2016, 1:29:40 PM
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
        <h1>Hello admin</h1>
        <form method="post" action="employeeservlet">
            <center>
                <a href="message.jsp">click to enter message or go below to insert taxi details</a>
                <p>Taxinumber:<br>
                    <input type="text" name="taxino">
                <p>
                    Drivername:<br><input type="text" name="drivername"></p>
                <p> Drivernumber:<br><input type="text" name="driverno"></p>
                <p> Taxitype:<br><input type="radio" name="taxitype" value="small" checked> Hatchback<br>
  <input type="radio" name="taxitype" value="medium"> Sedan<br>
    <input type="radio" name="taxitype" value="large"> Suv<br>
                  <p> State:<br><input type="text" name="state"></p>
                                  <p>Priority:<br><input type="text" name="priority"></p>
                <p> <input type="submit" value="enter"></p>
            </center>
            </form>
        <form method="post" action="logoutservlet">
    <input type="submit" value="Logout"/>
</form>
    </body>
</html>
