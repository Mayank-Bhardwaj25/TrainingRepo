package com.coforge.services;

import java.util.List;

import com.coforge.entities.Customers;

public interface CustomerServiceInterface {
	
	public List<Customers> getAllCustomers();
	public Customers saveCustomer(Customers customer);
	public Customers updateCustomer(Customers customer, long id);
	public Customers getCustomerById(long id);
	public void deleteCustomer(long id);

}
