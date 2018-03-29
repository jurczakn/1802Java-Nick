package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.domains.HoneyPot;
import com.revature.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		
		Session sess = HibernateUtil.getSession();
		
		HoneyPot hp = new HoneyPot(0, 78, 24);
		
		System.out.println("Before persisting object");
		
		Transaction t = sess.beginTransaction();
		
		int id = (int) sess.save(hp);
		
		System.out.println("After persisting object");
		
		System.out.println("Id: " + id);
		
		hp = (HoneyPot) sess.get(HoneyPot.class, 50);
		
		System.out.println("first honeypot: " + hp);
		
		hp.setHoneyAmount(7);
		
		sess.update(hp);
		
/*		HoneyPot hp2 = (HoneyPot) sess.get(HoneyPot.class, 100);
		
		sess.delete(hp2);*/
		
		HoneyPot hp3 = (HoneyPot) sess.load(HoneyPot.class, 200);
		
		t.commit();
		
		System.out.println(hp3);
		
		sess.close();
		
		System.out.println("Closed session");
		
		System.out.println(hp3);

	}

}
