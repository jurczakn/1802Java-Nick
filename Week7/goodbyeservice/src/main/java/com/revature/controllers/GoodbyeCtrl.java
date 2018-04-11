package com.revature.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeCtrl {
	
	@RequestMapping("/")
	public String goodbye(){
		
		return "goodbye for now";
		
	}

}
