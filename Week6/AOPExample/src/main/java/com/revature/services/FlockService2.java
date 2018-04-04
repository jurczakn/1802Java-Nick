package com.revature.services;

import org.springframework.stereotype.Component;

@Component
public class FlockService2 {
	
	public void notFly(String s) {
		
		System.out.println("I am flying");
		System.out.println("S: " + s);
		
	}
	
	public void fly(int i) {
		
		System.out.println("I am flying");
		System.out.println("S: " + i);
		
	}

}
