package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.CustomerDAO;
import com.coforge.entities.Customers;
import com.coforge.exceptions.CustomerNotFoundException;
@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerDAO dao;
	@Override
	public List<Customers> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

	@Override
	public Customers saveCustomer(Customers customer) {
		
		return dao.saveCustomer(customer);
	}

	
	@Override
	public Customers updateCustomer(Customers customer, long id) {
		
		Customers exCustomer = dao.getCustomerById(id).orElseThrow(() -> new CustomerNotFoundException("No Customer Found with this id" +id));
	
			exCustomer.setCname(customer.getCname());
			exCustomer.setAddress(customer.getAddress());
			exCustomer.setMobile(customer.getMobile());
			exCustomer.setEmail(customer.getEmail());
			return dao.saveCustomer(exCustomer);

		
	}

	@Override
	public Customers getCustomerById(long id) {
		
		return dao.getCustomerById(id).orElseThrow(() -> new CustomerNotFoundException("No Customer Found with this id" +id));
	}

	@Override
	public void deleteCustomer(long id) {
		Customers exCustomer = dao.getCustomerById(id).orElseThrow(() -> new CustomerNotFoundException("No Customer Found with this id" +id));
		
		dao.deleteCustomer(id);
       System.out.println("customer deleted");
		
	}

}
