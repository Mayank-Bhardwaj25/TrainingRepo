package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import com.coforge.entities.Customers;

public interface CustomerDaoInterface {

	public List<Customers> getAllCustomers();
	public Customers saveCustomer(Customers customer);
	public Customers updateCustomer(Customers customer);
	public Optional<Customers> getCustomerById(long id);
	public void deleteCustomer(long id);
	
}
