package com.revature.driver;

import java.util.Scanner;

import com.revature.exception.MissingUsernameOrPassword;

public class ScannerDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hello " + args[0]);
		System.out.print("Please enter your username:");

		String username = scan.nextLine();

		System.out.print("Please enter your password:");

		String password = scan.nextLine();

		/*
		 * System.out.println("Username: " + username);
		 * System.out.println("Password:" + password);
		 */
		
		String result = "";
		try {
			result = (login(username, password)) ? "successful login" : "invalid login";
		} catch (MissingUsernameOrPassword e) {

			result = "Missing Username Or Password";
			e.printStackTrace();

		}
		System.out.println(result);
		
		int i = 5;
		
		try {
			if(login(username, password) & 6 > i++){
				
				i++;
				
			}
		} catch (MissingUsernameOrPassword e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i);

	}

	public static boolean login(String username, String password) throws MissingUsernameOrPassword {

		if (username.isEmpty() ^ password.isEmpty()) {

			throw new MissingUsernameOrPassword();

		}

		if ("myUser".equals(username) && "psw".equals(password)) {

			return true;

		}

		else {

			return false;

		}

	}

}
