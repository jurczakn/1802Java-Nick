package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.revature.HelloClient;

import feign.Feign;

@RestController
public class ConsumerCtrl {
	
	public static int count = 0;
	
	
	@GetMapping("/")
	@HystrixCommand(fallbackMethod="myFallback")
	public String doGet(){
		
		if (count++>5){
			
			throw new RuntimeException();
			
		}
		
		return "ok";
		
	}
	
	private String myFallback(){
		
		return "whoooops";
		
	}
	
	@GetMapping("/hellomessage")
	@HystrixCommand(fallbackMethod="myFallback")
	public String hello(){
		
		return Feign.builder()
				.target(HelloClient.class, "http://localhost:10000/hello")
				.getHelloMessage();
		
	}

}
