package com.revature.services;

import org.springframework.stereotype.Service;

@Service
public class FlockService {
	
	public void fly(String s) {
		
		System.out.println("I am flying");
		System.out.println("S: " + s);
		
	}
	
	public void fly(int i) {
		
		System.out.println("I am flying");
		System.out.println("S: " + i);
		
	}

}
