package com.revature.driver;

public class CompareDriver {
	
	public static void main(String[] args) {
		
		CoffeeMakers cm1 = new CoffeeMakers(4, 5.0, "Mr.Coffee");
		CoffeeMakers cm2 = new CoffeeMakers(1, 1.3, "Keuriga");
		CoffeeMakers cm3 = new CoffeeMakers(4, 7.0, "Bunn");
		CoffeeMakers cm4 = new CoffeeMakers(1, 1.3, "Bonavita");
		CoffeeMakers cm5 = new CoffeeMakers(1, 1.3, "Bonavita");
		
		System.out.println(cm1 + " vs " + cm2 + ": " + cm1.compareTo(cm2));
		System.out.println(cm1 + " vs " + cm3 + ": " + cm1.compareTo(cm3));
		System.out.println(cm2 + " vs " + cm4 + ": " + cm2.compareTo(cm4));
		System.out.println(cm4 + " vs " + cm3 + ": " + cm4.compareTo(cm3));
		System.out.println(cm4 + " vs " + cm5 + ": " + cm4.compareTo(cm5));
		
	}

}