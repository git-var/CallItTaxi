/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.controller;

import com.mvc.people.taxi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.service.employeesevice;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SONY
 */
@WebServlet(name = "employeeservlet", urlPatterns = {"/employeeservlet"})
public class employeeservlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String taxino=request.getParameter("taxino");
            String drivername =request.getParameter("drivername");
            String driverno=request.getParameter("driverno");
            String taxitype=request.getParameter("taxitype");
            String state=request.getParameter("state");
            String priority=request.getParameter("priority");
            taxi ta=new taxi();
            ta.setDrivername(drivername);
            ta.setDriverno(driverno);
            ta.setPriority(priority);
            ta.setState(state);
            ta.setTaxino(taxino);
            ta.setTaxitype(taxitype);
            employeesevice es=new employeesevice();
            es.insert(ta);
            response.sendRedirect("employee.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(employeeservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
