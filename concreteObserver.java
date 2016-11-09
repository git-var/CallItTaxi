/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.people;

import com.mvc.database.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class concreteObserver extends Observer{
    private Connection connection = null;
	private final PreparedStatement statement = null;
    public String msg;
    public concreteObserver(subjectObserver subject){
      this.subject = subject;
      this.subject.attach(this);
     //msg=msg;
    }
    @Override
   public void update(String msg)
   {
        try {
            //       throws ClassNotFoundException,
//			SQLException, Exception {
            //connection = FERSDataConnection.createConnection();
            //Statement selStatement = connection.createStatement();
            //statement = connection.prepareStatement(query.getInsertQuery());
            connection= dbconnection.createConnection();
            //dbconnection dbconn=new dbconnection();
            // Connection myconnection;
            // myconnection = dbconn.Connection();

            String sqlString;
            sqlString = "UPDATE customer SET message = '"+msg+"'";
            PreparedStatement preparedStmt = connection.prepareStatement(sqlString);
            preparedStmt.execute();
            // Statement myStatement = connection.createStatement();
            //myStatement.executeUpdate(sqlString);
            connection.close();
// System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(concreteObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
