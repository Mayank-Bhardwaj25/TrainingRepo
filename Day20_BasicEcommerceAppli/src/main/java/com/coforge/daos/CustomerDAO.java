package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Customers;
import com.coforge.repositories.CustomerRepository;

@Repository
public class CustomerDAO implements CustomerDaoInterface{
	
	@Autowired
	CustomerRepository repository;

	
	@Override
	public List<Customers> getAllCustomers() {
		
		return repository.findAll();
	}

	@Override
	public Customers saveCustomer(Customers customer) {
		
		return repository.save(customer);
	}

	@Override
	public Customers updateCustomer(Customers customer) {
		
		return repository.save(customer);
	}

	@Override
	public void deleteCustomer(long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Customers> getCustomerById(long id) {
		
		return repository.findById(id);
	}

	
}
