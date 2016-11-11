/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.controller;

import com.mvc.people.concreteObserver;
import com.mvc.people.subjectObserver;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONY
 */
@WebServlet(name = "messageservlet", urlPatterns = {"/messageservlet"})
public class messageservlet extends HttpServlet{

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   String msg=request.getParameter("msg");
   subjectObserver subject = new subjectObserver();
      new concreteObserver(subject) ;
            subject.setState(msg);
      response.sendRedirect("employee.jsp");
    }
}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
 

