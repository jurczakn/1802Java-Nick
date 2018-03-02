package com.revature.thread;

public class MyRunner implements Runnable {

	@Override
	public void run() {

		for (int i = 1000000000; i > 0; i--) {

			System.out.println("---------->Runnable " + i + " times");

		}

	}

}
