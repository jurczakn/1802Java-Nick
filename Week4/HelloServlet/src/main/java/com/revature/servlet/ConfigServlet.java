package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ServletConfig 
 * 	- Interface
 * 	- Holds initialization parameters for a single servlet
 * 	- Only one servlet can access those key/value pairs
 * 	- Tags:
 * 		- <init-param>
 * 		- <param-name>
 * 		- <param-value>
 * 	- Some methods:
 * 		- getInitParameter(String name)
 * 		- getInitParameterNames()
 * 		- getServletConfig()
 * 
 */

public class ConfigServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Inside ConfigServlet doGet");
		String value = getInitParameter("name1");
		System.out.println(value);
		String value2 = getServletContext().getInitParameter("name2");
		System.out.println(value2);
		
	}
	
	

}
