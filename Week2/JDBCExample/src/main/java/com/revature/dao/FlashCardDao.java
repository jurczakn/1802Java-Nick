package com.revature.dao;

import java.util.List;

import com.revature.pojo.FlashCard;

public interface FlashCardDao {
	
	public void createFlashCard(FlashCard flashCard);
	
	public FlashCard retrieveFlashCardById(int id);
	
	public List<FlashCard> retrieveAllFlashCards();
	
	public void updateFlashCard(FlashCard flashCard);
	
	public void deleteFlashCard(int id);
	
	public void createFlashCardPreparedStmt(FlashCard flashCard);

}
