package com.revature.thread;

public class ThreadDriver {
	public static void main(String[] args) {
		
		Thread t = new MyThread();
		
		t.start();
		
		//t.run();  should no call run explicitly, the start method will call run
		
		Thread t2 = new Thread(new MyRunner());
		
		t2.start();
		
		for(int i = 0; i < 1000000000; i++){
			
			System.out.println("************** " + i + "times");
			
		}
		
	}

}
