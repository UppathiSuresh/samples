package com.dynamicwebapplication;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	//	PrintWriter out = response.getWriter();
		//out.println("Hello World");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		String user = request.getParameter("loginid");
		String pass = request.getParameter("passwordid");
		if (user.isEmpty() && pass.isEmpty()) {
			pw.println("<html>");
			pw.println("<h3>it is manditary enter the username and password<h3>");
			pw.println("</html>");
			//pw.print("Sorry username or password error");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request,response);
			// response.sendRedirect("index.jsp");
		} else {
			if (user.equals("suresh") && pass.equals("suresh")) {
				pw.println("Login Success...!");
			} else {
				pw.println("Login Failed...!");
				pw.println("Please Enter the Correct UserName and Password");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

				rd.include(request,response);
			}
			pw.close();
		}
	}

}
