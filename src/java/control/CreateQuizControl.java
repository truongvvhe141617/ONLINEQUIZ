/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Quiz;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Vuong Van Truong
 */

@WebServlet(name = "CreateQuizControl", urlPatterns = {"/make-quiz"})
public class CreateQuizControl extends HttpServlet {

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
		request.getRequestDispatcher("MakeQuiz.jsp").forward(request, response);
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
			request.setCharacterEncoding("UTF-8");
			String question = request.getParameter("question");
			String option1 = request.getParameter("option1");
			String option2 = request.getParameter("option2");
			String option3 = request.getParameter("option3");
			String option4 = request.getParameter("option4");
			String answers[] = request.getParameterValues("answer"); 
			String myanswer = "";
			for (String str : answers) {
				myanswer += str + " ";
			}
			myanswer = myanswer.substring(0, myanswer.length() - 1);
			
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String date = df.format(now);
			
			HttpSession session = request.getSession();
			User u = (User) session.getAttribute("user");
			int uid = u.getId();
			DAO dao = new DAO();
			
			if (question !=  "") {
				request.setAttribute("mess", "Create success!!!");
				request.getRequestDispatcher("MakeQuiz.jsp").forward(request, response);
				dao.makeQuiz(question, option1, option2, option3, option4, myanswer, date, uid);
			} 
		} catch (Exception e) {
			request.setAttribute("mess", "Create fail!");
				request.getRequestDispatcher("MakeQuiz.jsp").forward(request, response);
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
