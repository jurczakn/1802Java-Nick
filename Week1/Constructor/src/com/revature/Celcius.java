package com.revature;

public class Celcius extends Temperature {
	/*Cannot override variable, they are shadowed
	 * value exists in both the parent and child.
	 * Celcius has 2 values, on from the Temperature class and one
	 * from its own class.  There is now no way to directly access the
	 * parent classes value.  THe only reason we can is because of 
	 * the getParentValue() and setParentValue() methods.
	 */
	public int value;
	
	{value = 10;}
	
	{System.out.println("Inside initialization block in Celcius");}
	
	//must call either super() or this()
	//must be on first line of constructor
	//calls super() implicitly 
	public Celcius(){
		//super(45);//refers to Temperature(int f)
		//super(); //refers to Temperature()
		this("");
		System.out.println("Celcius no args constructor");
		//super(45);
		
	}
	
	public Celcius(String s){
		super(45);
	}
	
	public int getValue(){
		
		return this.value;
		
	}
	
	public void setValue(int v){
		
		this.value = v;
		
	}
	
	/*Does not work because super() is always
	 * implicitly called unless you call this()
	 */
	//public Celcius(int i){}

}