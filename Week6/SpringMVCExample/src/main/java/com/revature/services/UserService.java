package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.domains.User;

@Service
public class UserService {
	
	public boolean authenticateUser(User user){
		
		if("Sam".equals(user.getUsername()) && "password".equals(user.getPassword())){
			
			return true;
			
		}
		
		return false;
		
	}

}
