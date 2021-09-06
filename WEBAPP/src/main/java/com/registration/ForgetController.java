package com.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForgetController
 */
@WebServlet("/ForgetController")
public class ForgetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String password = request.getParameter("login");
		RegistrationBean rb = null;
		RegistrationModel rm = new RegistrationModel();
		try {
			rb = new RegistrationBean();
			rb = rm.testforget(password);
		}catch (Exception e) {
			e.printStackTrace();
				}
		if(rb!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("ForgetView.jsp");{
			request.setAttribute("email", rb.getPassword());
			rd.forward(request, response);	}
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("ForgetView.jsp");
			request.setAttribute("error", "invalid user id");
			rd.forward(request, response);}

		
		
			
		}
	
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}





	}


