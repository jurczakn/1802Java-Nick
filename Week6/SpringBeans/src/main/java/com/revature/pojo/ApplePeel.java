package com.revature.pojo;

import org.springframework.stereotype.Component;

//@Component
public class ApplePeel implements Peel {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "This is now an apple peel";
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub

	}
	
	public ApplePeel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		
		return "this is an apple peel";
		
	}
	
	

}