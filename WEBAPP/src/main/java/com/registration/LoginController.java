package com.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(urlPatterns = "/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		String email = request.getParameter("Login");
		String password = request.getParameter("Password");
		
		
		

		RegistrationBean rb = null;
		
		
		
		
		RegistrationModel rm = new RegistrationModel();
		String  fn = null;
		try {
			rb = new RegistrationBean();
			rb = rm.Testauthentication(email, password);
			fn = rb.getFirst_name();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (rb!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("fname", fn);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WelcomeCtl");
			
			rd.forward(request, response);
			} 
		else {
			RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("error", "invalid user id or password");
			rd.forward(request, response);}

		}
	

		
		

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");

		}
	

}