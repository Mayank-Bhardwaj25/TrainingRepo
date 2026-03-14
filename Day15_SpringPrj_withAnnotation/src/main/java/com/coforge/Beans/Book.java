package com.coforge.Beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Book {
	
	//@Value("${Book.id}")
	private long bookId;
	
	//@Value("${Book.title}")
	private String title;
	
	//@Value("${Book.price}")
	private double price;
	
	//@Value("#{'${Book.author}'.split(',')}")
	private List <String> author;

	public Book() {
		super();
	}

	public Book(long bookId, String title, double price, List<String> author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
	
	
	

}
