/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.service;
import com.mvc.database.dbconnection;
import com.mvc.people.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.people.MyThreadLocal;
/**
 *
 * @author SONY
 */
public class orderservice{
    private Connection connection=null;
    private Statement statement=null;
    private ResultSet resultSet;
    private Object session;

    /**
     *
     * @param o
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void store(Order o,String uid)throws ClassNotFoundException,SQLException
    {
       //HttpSession session=request.getSession();
        //String name="k";
//        Object user = MyThreadLocal.get();
//        name1=(String) user;
        String name1;
        name1 = uid;
        String types=o.getTypes();
        String from=o.getFrom();
        String to=o.getTo();
        String time=o.getTime();
        String phno=o.getPhno();
        connection= dbconnection.createConnection();
String sqlString="INSERT INTO book (name,type,from,to,time,phno) VALUES ('"+name1+"','"+types+"','"+from+"','"+to+"',"+time+"','"+phno+"')";
            PreparedStatement preparedStmt = connection.prepareStatement(sqlString);    
                    preparedStmt.execute();
                             connection.close();
        
    }
}
