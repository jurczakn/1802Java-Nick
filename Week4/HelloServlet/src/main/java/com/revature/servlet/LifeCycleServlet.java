package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * init 	- Initializes the servlet in the servlet container (web container)
 * 			- Called once
 * 				- Either on first request OR on startup (if <load-on-startup> tag is present in <servlet> tag)
 * 			- Want to test it?
 * 				- Republish the server
 *  
 * service 	- Handles a request to this servlet. Basically forwards the request to the appropriate method (doGet, doPost, doPut, doDelete, doHead, doOptions, doTrace)
 * 				- NOTE: this method is abstract in GenericServlet
 * 				- NOTE: this method is implemented in HttpServlet
 * 			- Called on every request to this servlet
 *			- Want to test it?
 * 		   		- http://localhost:7001/ServletExamples/lmUrl 
 * 
 * destroy 	- Destroys the servlet
 * 			- Typically called when servlet container stops/restarts
 * 		   		- Most likely not called during normal operations
 * 				- So maybe called once
 * 			- Want to test it?
 * 				- Republish the server
 */
public class LifeCycleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		String username = req.getParameter("username");
		
		writer.write("<h1>Welcome " + username + "</h1>");
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service in lifecycle servlet");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy in lifecycle servlet");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init in lifecycle servlet");
		super.init();
	}
	
	

}
