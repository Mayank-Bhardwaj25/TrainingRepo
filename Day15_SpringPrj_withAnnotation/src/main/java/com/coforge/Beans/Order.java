package com.coforge.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Order {
	
	//@Value("345")
	private int ordId;
	
	//@Value("5")
	private int nou;
	//@Value("5000")
	private double orderCost;
	
	@Autowired
	private Book book;

	public Order() {
		super();
	}

	public Order(int ordId, int nou, double orderCost, Book book) {
		super();
		this.ordId = ordId;
		this.nou = nou;
		this.orderCost = orderCost;
		this.book = book;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public void setNou(int nou) {
		this.nou = nou;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", nou=" + nou + ", orderCost=" + orderCost + ", book=" + book + "]";
	}
	
	
	

}
