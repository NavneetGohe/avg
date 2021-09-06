package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentCtl")
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		StudentBean sb = new StudentBean();
		sb.setRollno(request.getParameter("rollno"));
		sb.setFirstname(request.getParameter("firstname"));
		sb.setLastname(request.getParameter("lastname"));
		sb.setSession(request.getParameter("session"));
		StudentModel sm = new StudentModel();
		String op = request.getParameter("operation");
		
		if (op.equals("Add")) {

			try {
				sm.add(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (op.equals("Modify")) {
			try {
				sm.modify(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (op.equals("Delete")) {
			try {
				sm.delete(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (op.equals("Get")) {
			try {
				sm.get(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if (op.equals("Search")) {
			try {
				StudentModel.search(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}