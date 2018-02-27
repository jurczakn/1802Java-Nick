package com.revature.pojo;

public class Anything {
	
	public static int numberOfThings = 6;
	
	private String theThing;
	
	public Anything(){
		super();
	}
	
	public Anything(String theThing){
		
		this.theThing = theThing;
		
	}
	
	public static void changeNumberOfThings(int i){
		
		Anything.numberOfThings = i;
		
	}
	
	public String getTheThing(){
		
		return this.theThing;
		
	}
	
	public void setTheThing(String theThing){
		
		this.theThing = theThing;
	}
	
	//The finalize method is called by the garbage collector before it destroys an object
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Destroying anything with theThing" + this.theThing);
		
	}
	

}
