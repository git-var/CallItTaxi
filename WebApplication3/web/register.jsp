<%-- 
    Document   : register
    Created on : 2 Nov, 2016, 12:20:31 PM
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
        <form method="post" action="registerservlet">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Register Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td>email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>address</td>
                        <td><input type="text" name="address" value="" /></td>
                    </tr>
                    <tr>
                        <td>Phno</td>
                        <td><input type="text" name="phno" value="" /></td>
                    </tr>
                    <tr>
                        <td>Category</td>
                        <td><input type="radio" name="category" value="student" />student
                        <input type="radio" name="category" value="worker" />worker
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit"></td>
                        <td><a href="login.jsp">login</a>
                    </tr>
                    <tr>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
