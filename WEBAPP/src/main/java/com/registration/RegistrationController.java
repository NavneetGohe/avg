package com.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/navneet")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("login");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		//String contact = request.getParameter("cn");
		

		RegistrationBean rb = new RegistrationBean();
		
		rb.setFirst_name(fname);
		rb.setLast_name(lname);
		rb.setLoginid(email)
;
		rb.setGender(gender);
		//rb.setContact(contact);
		
		RegistrationModel rm = new RegistrationModel();
		
		try {
			rm.testAdd(rb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("login");
		String password = request.getParameter("password");
		String gender = request.getParameter("gn");
		
		long c = Long.parseLong(request.getParameter("cn"));
		

		RegistrationBean rb = new RegistrationBean();
		
		rb.setFirst_name(fname);
		rb.setLast_name(lname);
		rb.setLoginid(email);
		rb.setPassword(password);
		rb.setGender(gender);
		rb.setContact(c);
		
		RegistrationModel rm = new RegistrationModel();
		
		try {
			rm.testAdd(rb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
