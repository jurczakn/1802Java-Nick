package com.revature.driver;

import com.revature.dao.FlashCardDao;
import com.revature.dao.FlashCardDaoImpl;
import com.revature.pojo.FlashCard;

public class Driver {

	public static void main(String[] args) {
		
		//ConnectionFactory.getInstance().getConnection();
		
		FlashCard myCard = new FlashCard(0, "Is this working", "It better");
		
		FlashCardDao fcd = new FlashCardDaoImpl();
		
		fcd.createFlashCard(myCard);
		
		System.out.println(fcd.retrieveFlashCardById(121));
		
		System.out.println("everything fine");

	}

}
