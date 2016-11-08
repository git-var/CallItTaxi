/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import com.mvc.database.dbconnection;
import com.mvc.people.registerinterface.insertdata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SONY
 */
public class User implements insertdata{

    //private static User instance;

   //make the constructor private so that this class cannot be
   //instantiated
 //  private User(){}

   //Get the only object available
  // public static User getInstance(){
   //   if(instance==null)
   //   {
    //  instance=new User();    
   //          return instance;
    //  }
    //  return instance;
 //  }
        public String username,password,email,address,phno,category;
        private Connection connection = null;
	private final PreparedStatement statement = null;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
     /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
   
     
            public void RegisterUser() throws ClassNotFoundException,
			SQLException, Exception {
		//connection = FERSDataConnection.createConnection();
		//Statement selStatement = connection.createStatement();
		//statement = connection.prepareStatement(query.getInsertQuery());
                connection= dbconnection.createConnection();
            //dbconnection dbconn=new dbconnection();
           // Connection myconnection;
           // myconnection = dbconn.Connection();

            String sqlString="INSERT INTO customer (username,password,email,address,phno,category) VALUES ('"+username+"','"+password+"','"+email+"','"+address+"','"+phno+"','"+category+"')";
            PreparedStatement preparedStmt = connection.prepareStatement(sqlString);    
                    preparedStmt.execute();
                 // Statement myStatement = connection.createStatement();
                //myStatement.executeUpdate(sqlString);
                connection.close();
          
    }

   
}