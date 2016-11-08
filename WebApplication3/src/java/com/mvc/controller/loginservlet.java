/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mvc.controller;

import com.mvc.people.User;
import com.mvc.service.loginservice;
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
@WebServlet(name = "loginservlet", urlPatterns = {"/loginservlet"})
public class loginservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String username,password;
            username=request.getParameter("username");
            password=request.getParameter("password");
                    User u =new User();                
            u.setUsername(username);
            u.setPassword(password);
            loginservice reg=new loginservice();
            String validate;
//                                MyThreadLocal local=new MyThreadLocal();
//                    local.setName(username);
                                validate = reg.authenticate(u);
            switch (validate) {
                case "SUCCESS":
                    HttpSession session = request.getSession();
session.setAttribute("userid",u.getUsername());
                    //HttpSession session;
//                    String p=u.getUsername();
//            session = request.getSession();
//                    session.setAttribute("userss",u); 
//                    Object user;
//            user = request.getSession().getAttribute(p);
//    MyThreadLocal.set((User) user);
                    response.sendRedirect("home.jsp");
                    break;
                case "PINGO":
                    response.sendRedirect("employee.jsp");
                    break;
                default:
                    response.sendRedirect("login.jsp");
                    break;
            }
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
