package com.revature;

public class Overloading {

	public static void main(String[] args) {

		/*Wrapper classes are object version
		 * of our primative types.
		 * All primative types have a wrapper class.
		 */
		Integer i = new Integer(5);
		Character c = new Character('c');
		Double d = new Double(9.999999999);
		Float f = new Float(0.0F);
		Long l = new Long(99999999999999999L);
		Boolean b = new Boolean(true);
		Short s = new Short((short) 0);
		Byte by = new Byte((byte)9);
		
		//autoBoxing
		getInteger(6);
		
		//autoUnBoxing
		getInt(i);
		
		
		int in = 10;
		
		int in2 = 9;
		
		int in3 = 3;
		
		int in4 = 7;
		
		/*getInts(6, new int[]{in, in2, in3, in4});
		
		getInts(in, in2, in3, in4);
		
		getInts(5);
		
		getInts(in);
		
		System.out.println(i + in);*/
		
		get(7);
		
	}

	public static void getInt(int i){
		

		
	}
	
	//Can pass 0 or more ints in
	//i is treated like an Array of ints
	public static void getInts(int x, int... i){
		
		System.out.println("Calling getInts");
		
		
		System.out.println("First index of i " + i[0]);
		
		//for each
		for(int j : i){
			
			System.out.println("value = " + j);
			
		}
		
	}
	
	/*public static void get(int i){
		
		System.out.println("Inside int get");
		
	}*/
	
	/*public static int get(int i){};*/
	
	public static void get(long i){
		
		System.out.println("Inside long get");
		
	}
	
	public static void get(Integer i){
		
		System.out.println("Inside Integer i");
		
	}
	
	public static int get(int... i){
		
		System.out.println("Inside varargs int get");
		return 0;
		
	}
	
	public static void get(long...ls){
		
		System.out.println("Inside varargs long get");
		
	}
	
	public static void getInteger(Integer i){}
	
}