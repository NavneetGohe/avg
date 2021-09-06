package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContextCtl")
public class ContextCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ContextCtl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		Integer count = (Integer) ctx.getAttribute("vistcount");
		
		if (count==null) {
			count =1;
			
		}else {
			count++;
		}
		ctx.setAttribute("visitcount", count);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>visitor count:"+count + "</h1>");
		out.println("</body></html>");
	}

}
