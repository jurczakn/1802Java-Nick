package com.revature;

public class Temperature {
	
	public static void main(String[] args) {
		//Temperature temp = new Temperature(45);
		System.out.println("****Calling Celcius constructor***");
		Celcius c = new Celcius();
		System.out.println("****Calling Temperature constructor***");
		Temperature temp = new Temperature(72);
		System.out.println("temp value: " + temp.value);
		System.out.println("temp value: " + temp.getParentValue());
		c.setValue(20);
		System.out.println("c value: " + c.value);
		System.out.println("c value: " + c.getValue());
		System.out.println("c value: " + c.getParentValue());
	}
	
	public int value;
	
	{System.out.println("Inside initialization block in temperature");}
	
	public Temperature(int f){
		//this(); //refers to Temperature()
		System.out.println("temp args constructor");
		this.value = f;
		
	}

	public int getParentValue() {
		return value;
	}

	public void setParentValue(int value) {
		this.value = value;
	}

	public Temperature() {
		super();
	}
	
	/*public Temperature(){
		super();//refers to Object()
		System.out.println("temp noargs constructor");
	}*/

}
