/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.controller;

import com.mvc.people.Order;
import com.mvc.people.User;
import com.mvc.service.orderservice;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "orderservlet", urlPatterns = {"/orderservlet"})
public class orderservlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String types=request.getParameter("types");
            String from=request.getParameter("from");
                        String to=request.getParameter("to");
            String time=request.getParameter("time");
            String phno=request.getParameter("phno");
                    Order o = Order.getInstance();                

           // Order o=new Order();
            o.setTime(time);
            o.setTypes(types);
            o.setFrom(from);
            o.setTo(to); 
            o.setPhno(phno);
            HttpSession session = request.getSession();
String uid= session.getAttribute("userid").toString();
            orderservice os=new orderservice();
            os.store(o,uid);
//            if("success".equals(val))
//            {
//                response.sendRedirect("simple.jsp");
//            }
            response.sendRedirect("simple.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(orderservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}
