package com.coforge.dao;

import java.util.List;

import com.coforge.entities.Item;
import com.coforge.entities.Order;

public interface OrderDaointerface {
	
	public List<Order> getAllOrders();
	
	public void insertOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int id);
	public Item getById(long id);

}
