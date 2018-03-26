package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.request.RequestHelper;

/**
 * Front Controller Design Patter
 * 	-Single Servlet
 * 	-map to url-pattern /*
 * 	-controls all forwarding and redirecting
 * 	-Front Controller
 * 		-handles incoming requests
 * 	-Dispatcher
 * 		-handles Forwarding/Redirecting
 * 	-Views
 * 		-Objects being requested
 * 
 * Client -> Server -> Web Containter -> Master Servlet -> Services(Buisness Layer)
 * 
 * Pro's
 * 	-simple web.xml
 * 	-no buisness logic inside of the servlet
 * 	-more control
 * 	-uses Java Classes instead of Servlets	
 * 
 * Con's
 * 	-more work
 * 	-more complex
 * 	-no encapsulation of routing
 * 		-everything in java
 * 
 * Servlet implementation class MasterServlet
 */
public class MasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = new RequestHelper().process(request, response);
		System.out.println(forward);
		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = new RequestHelper().process(request, response);
		request.getRequestDispatcher(forward).forward(request, response);
	}

}