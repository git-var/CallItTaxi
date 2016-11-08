/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.service;

import com.mvc.database.dbconnection;
import com.mvc.people.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SONY
 */
public class registerservice {
    private Connection connection=null;
    private Statement statement=null;
    private ResultSet resultSet;

    public registerservice() {
        this.resultSet = null;
    }

    /**
     *
     * @param u
     * @return
     * @throws java.lang.ClassNotFoundException
     */
    public String authenticate(User u) throws ClassNotFoundException,SQLException
 {
     String uname;
        uname = u.getUsername();
     String upass;
        upass = u.getPassword();
     String name,pass;
     String p="admin";
     try 
            {      
                connection= dbconnection.createConnection();
   statement = connection.createStatement(); 
//Statement is used to write queries. Read more about it.
 resultSet = statement.executeQuery("SELECT username,password from customer"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
 while(resultSet.next()) // Until next row is present otherwise it return false
 {
  name = resultSet.getString("username"); //fetch the values present in database
  pass = resultSet.getString("password");
 
   if(uname.equals(name) && upass.equals(pass))
   {
        if(name.equals("admin"))
   {
       return "PINGO";
   }
        else{
               return "SUCCESS";
       }
   }
 }
     }          
 catch(ClassNotFoundException | SQLException e)
 {
 } // Just returning appropriate message otherwise
        return "FALSE";
 }
}

 