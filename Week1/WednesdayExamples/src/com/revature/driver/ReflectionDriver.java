package com.revature.driver;

import java.lang.reflect.Field;

public class ReflectionDriver {

	public static void main(String[] args) {

		String s = "Class String";

		System.out.println("Old Value: " + s);

		Class<String> stringClass = String.class;

		try {
			Field value = stringClass.getDeclaredField("value");
			value.setAccessible(true);
			value.set(s, "Bananana".toCharArray());
			System.out.println("New Value: " + s);
			System.out.println("Class String");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s = "New String";

		while (true) {
			new Object();
			System.gc();

			System.out.println("Class String");
		}
	}

}
