package com.revature.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		FlockService fs = ac.getBean("flockService", FlockService.class);

		fs.fly("ducks");
		
		fs.fly(5);
		
		FlockService2 fs2 = ac.getBean("flockService2", FlockService2.class);
		
		fs2.fly(5);
		
		fs2.notFly("no");
		
	}

}