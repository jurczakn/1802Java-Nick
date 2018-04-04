package com.revature.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.domains.User;
import com.revature.services.UserService;

@RestController
public class LoginCtrl2 {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="login", method=RequestMethod.POST, 
			consumes={MediaType. APPLICATION_JSON_VALUE}, 
			produces=MediaType.TEXT_PLAIN_VALUE)
	public String Login(@RequestBody User user){
		
		System.out.println(user);
		
		if(userService.authenticateUser(user)){
			
			return "success";
			
		}
		
		return "invalid login";
		
	}
}
