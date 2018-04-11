package com.revature.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	
	@RequestMapping("/")
	public String hello(){
		
		return "hello world";
		
	}

}
