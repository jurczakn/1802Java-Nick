package com.revature.request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public String process(HttpServletRequest req, HttpServletResponse resp){
		
		String path = req.getRequestURI();
		
		String dest = null;
		
		System.out.println(path);
		
		switch(path){
		
		case "/FrontController/home.do": dest = "home.html";
						break;
		case "/FrontController/form.do": dest = "form.html";
						break;
		default: dest="404.html";
		
		}
		
		return dest;
		
	}
	
	public RequestHelper(){
		super();
	}

}
