/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.controller;

import com.mvc.database.dbconnection;
import com.mvc.people.Context;
import com.mvc.people.large;
import com.mvc.people.medium;
import com.mvc.people.small;
import com.mvc.people.taxi;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SONY
 */
@WebServlet(name = "fareservlet", urlPatterns = {"/fareservlet"})
public class fareservlet extends HttpServlet {
private Connection connection=null;
    private Statement statement=null;
    private ResultSet resultSet;

    public fareservlet() {
        this.resultSet = null;
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
String uid= session.getAttribute("userid").toString();

int time=0;
try 
            {      
                connection= dbconnection.createConnection();
   statement = connection.createStatement(); 
//Statement is used to write queries. Read more about it.
 resultSet = statement.executeQuery("SELECT time from book WHERE name='"+uid+"'"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
 while(resultSet.next())
 {
 time =Integer.parseInt(resultSet.getString("time")); //fetch the values present in database
            }
            }
 catch(ClassNotFoundException | SQLException e)
 {
 }
//PrintWriter writer = response.getWriter();
//String htmlRespone = "<html>";
//htmlRespone += "<h2>Your time is: " + time + "<br/>";
//htmlRespone += "Your password is: " + ti.getTaxino() + "</h2>";
//htmlRespone += "</html>";
//writer.println(htmlRespone);
int initial = 0;
float discount = 0;
float distance;
Context context=new Context();
String type=request.getParameter("type").toString();
////PrintWriter writer = response.getWriter();
////String htmlRespone = "<html>";
////htmlRespone += "<h2>Your username is: " + type + "<br/>";
////htmlRespone += "Your password is: " + ti.getTaxino() + "</h2>";
////htmlRespone += "</html>";
////writer.println(htmlRespone);
switch(type)
{
case "small":
      small sm=new small();
      context.setFare(sm);
      sm.calc(context,time);
      initial=sm.pric();
      break;
case "medium":
      medium me=new medium();
      context.setFare(me);
      me.calc(context, time);
      initial=me.pric();
      break;
case "large":
      large la=new large();
      context.setFare(la);
      la.calc(context,time);
      initial=la.pric();
      break;
 }
//PrintWriter writer = response.getWriter();
//String htmlRespone = "<html>";
//htmlRespone += "<h2>Your initial is: " + initial + "<br/>";
//htmlRespone += "Your password is: " + ti.getTaxino() + "</h2>";
//htmlRespone += "</html>";
//writer.println(htmlRespone);
try 
{      
 connection= dbconnection.createConnection();
 statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
 resultSet = statement.executeQuery("SELECT discount from customer WHERE username='"+uid+"'"); 
while(resultSet.next())
{
// discount =Float.parseFloat(resultSet.getString("discount"));
 //BigDecimal myValue = resultSet.getBigDecimal("discount");
  discount = resultSet.getFloat("discount");

}
}
catch(ClassNotFoundException | SQLException e)
 {
 }
//PrintWriter writer = response.getWriter();
//String htmlRespone = "<html>";
//htmlRespone += "<h2>Your discount is: " + discount + "<br/>";
//htmlRespone += "Your password is: " + ti.getTaxino() + "</h2>";
//htmlRespone += "</html>";
//writer.println(htmlRespone);
//int maximum=50;
//int minimum=1;
Random rn = new Random();
int Low = 1;
int High = 50;
distance= rn.nextInt(High-Low) + Low;//int n = maximum - minimum + 1;
//int i = rn.nextInt() % n;
//distance =  minimum + i;
//PrintWriter writer = response.getWriter();
//String htmlRespone = "<html>";
//htmlRespone += "<h2>Your distance is: " + distance + "<br/>";
//htmlRespone += "</html>";
//writer.println(htmlRespone);
float price=0;
price=initial*distance*discount;
String taxino = null;
try{
      connection= dbconnection.createConnection();
  
   statement = connection.createStatement(); 
//Statement is used to write queries. Read more about it.
 resultSet = statement.executeQuery("SELECT taxino from taxi where taxitype='"+type+"' AND state='active' AND priority='1'"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
 while(resultSet.next()){ 
 taxino = resultSet.getString("taxino"); 
 }
}
 catch(ClassNotFoundException | SQLException e)
 {
 }
try{
    connection= dbconnection.createConnection();

            //dbconnection dbconn=new dbconnection();
           // Connection myconnection;
           // myconnection = dbconn.Connection();

            String sqlString="INSERT INTO reciept (customername,taxinumber,fare) VALUES ('"+uid+"','"+taxino+"','"+price+"')";
            PreparedStatement preparedStmt = connection.prepareStatement(sqlString);    
                    preparedStmt.execute();
                 // Statement myStatement = connection.createStatement();
                //myStatement.executeUpdate(sqlString);
                connection.close();
}
catch(ClassNotFoundException | SQLException e)
 {
 }
request.setAttribute("price",price);
request.getRequestDispatcher("fare.jsp").forward(request, response);

    }
}  