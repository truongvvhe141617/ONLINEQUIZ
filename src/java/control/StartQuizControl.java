/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Quiz;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Vuong Van Truong
 */

@WebServlet(name = "StartQuizControl", urlPatterns = {"/start-quiz"})
public class StartQuizControl extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try {
            int amount = Integer.parseInt(request.getParameter("num"));
            HttpSession session = request.getSession();
            Date now = new Date();
            SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
            if (session.getAttribute("now") == null) {
				//get cookie to read 
                Cookie arr[] = request.getCookies();
                //remove cookie 
                if (arr.length != 0) {
                    for (Cookie cookie : arr) {
                        if (cookie.getName().equals("myindex")) {
                            cookie.setMaxAge(0);
                            response.addCookie(cookie);
                        }
                        if (cookie.getName().equals("answers")) {
                            cookie.setMaxAge(0);
                            response.addCookie(cookie);
                        }
                    }
                }
				
                DAO dao = new DAO();
                session.setAttribute("now", df.format(now));
                request.setAttribute("total", amount * 60);
				
                List<Quiz> list = dao.getListQuiz(amount);// list question
                session.setAttribute("list", list);
                
                request.setAttribute("list", list);
                request.setAttribute("tag", 0);
                request.setAttribute("txt", "");
            } else {
                List<Quiz> list = (List<Quiz>) session.getAttribute("list");
				
                String time = session.getAttribute("now").toString();
                Date before = df.parse(time); 
                int nowsecond = now.getMinutes() * 60 + now.getSeconds();
                int beforesecond = before.getMinutes() * 60 + before.getSeconds(); 
                int space = nowsecond - beforesecond; 
                request.setAttribute("total", amount * 60 - space);
				
                request.setAttribute("list", list);
                Cookie arr[] = request.getCookies();
                int index = 0;
                String txt = "";
				
                //Set index and answers into cookie
                for (Cookie cookie : arr) {
                    if (cookie.getName().equals("myindex")) {
                        index = Integer.parseInt(cookie.getValue());
                    }
                    if (cookie.getName().equals("answers")) {
                        txt = cookie.getValue();
                    }
                }
                request.setAttribute("tag", index);
                request.setAttribute("txt", txt);
            }
            request.getRequestDispatcher("StartQuiz.jsp").
            
                    forward(request, response);

        } catch (Exception e) {
			
                                request.getRequestDispatcher("TakeQuiz.jsp").
                    forward(request, response);
        }
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
//        processRequest(request, response);
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
