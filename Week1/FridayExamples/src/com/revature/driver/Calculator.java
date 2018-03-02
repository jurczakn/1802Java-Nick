package com.revature.driver;

public class Calculator <T extends Number, G extends Number> {
	
	public static void main(String[] args) {
		
		Calculator<Integer, Double> c = new Calculator<>();
		
		System.out.println(c.add(5, 7.0));
		
		//Calculator<String, String> c1 = new Calculator<>();
		
	}
	
	public T add(T i, G j){
		
		Number ret = i.doubleValue() + j.doubleValue();
		
		return (T) ret;
		
	}

}
