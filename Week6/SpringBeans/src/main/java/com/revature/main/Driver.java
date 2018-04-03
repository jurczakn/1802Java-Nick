package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.pojo.Banana;
import com.revature.pojo.BananaPeel;
import com.revature.pojo.Peel;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Banana b = ac.getBean("banana", Banana.class);
		
		b.getPeel().setColor("YellowGreenBlack");
		
		//System.out.println(b);
		
		Banana b2 = ac.getBean("banana", Banana.class);
		
		Peel p = ac.getBean("banana-peel", BananaPeel.class);
		
		p.setColor("white");
		
		//b2.setPeel(p);
		
		b2.setName("my second bean");
		
		System.out.println(b2);
		
		System.out.println(b);

	}

}
