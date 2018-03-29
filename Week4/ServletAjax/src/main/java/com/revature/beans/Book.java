package com.revature.beans;

public class Book {

	String title;
	String desc;
	int isbn;
	String author;
	int pageCount;
	public Book() {
		super();
	}
	public Book(String title, String desc, int isbn, String author, int pageCount) {
		super();
		this.title = title;
		this.desc = desc;
		this.isbn = isbn;
		this.author = author;
		this.pageCount = pageCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", desc=" + desc + ", isbn=" + isbn + ", author=" + author + ", pageCount="
				+ pageCount + "]";
	}
	
	
	
}
