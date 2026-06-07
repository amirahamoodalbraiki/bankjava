package com.training.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String name ;
    public void init() {
    	name = "Saleem";
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read credentials from request parameters
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username: " + username + ", password: " + password);

		// Hard-coded credential check: username must match 'name' (initialized in init)
		// and password must be "admin". Forward to success.jsp on match; otherwise failure.jsp.
		if (username != null && password != null && username.equals(name) && password.equals("admin")) {
			request.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
			return;
		} else {
			request.setAttribute("error", "Invalid username or password");
			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
