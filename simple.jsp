<%-- 
    Document   : simple
    Created on : 6 Nov, 2016, 9:49:57 PM
    Author     : SONY
--%>

<%@page import="com.mvc.people.driverdetails"%>
<%@page import="com.mvc.people.taxi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>your Taxi Details!</h1>
        <p><b>Taxinumber:${ti.getTaxino()}</b></p><br>
        <p><b>Drivername:${ti.getDrivername()}</b></p><br>
        <p><b>Drivernumber:${ti.getDriverno()}</b></p><br>
        <p><b>Taxitype:${ti.getTaxitype()}</b></p><br>
        <p>Click on confirm to view price</p>
        <form method="post" action="fareservlet">
                <input type="hidden" name="type" value="${ti.getTaxitype()}" />
            <input type="submit" value="confirm"/>
            <a href="home.jsp">cancel</a>
        </form>
    </body>
</html>