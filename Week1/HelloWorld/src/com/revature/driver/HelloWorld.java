package com.revature.driver;

import com.revature.pojo.Anything;

//import static com.revature.pojo.Anything.numberOfThings;
//import static com.revature.pojo.Anything.changeNumberOfThings;
import static com.revature.pojo.Anything.*;

public class HelloWorld {

	static public void main(String[] args) {

		com.revature.pojo.Anything anything = new com.revature.pojo.Anything();
		
		System.out.println(Anything.numberOfThings);
		
		changeNumberOfThings(20);
		
		System.out.println(numberOfThings);
		
		String myString;
		myString = "Welcome";

		int myInt = 5;

		System.out.println("Result " + count3(1000));

	}

	private static int count(int i) {

		System.out.println("Value of i initially: " + i);

		while (i < 100) {

			System.out.println("Inside count: " + i);

			i += 17;
		}

		return i;

	}

	private static int count2(int i) {
		System.out.println("Value of i initially: " + i);

		do {

			System.out.println("Inside count: " + i);

			i += 17;

		} while (i < 100);

		return i;
	}

	private static int count3(int i) {

		for(int x = 10; x >= 0; x--){
			
			if(x == 6){continue;}
			
			if(x == 3){break;}
			
			System.out.println(x);
			
		}
		
		return i++;
		
	}

}
