package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Customers;
import com.coforge.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customers>>  getAllCustomers() {
		
		return new ResponseEntity<>(service.getAllCustomers(), HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customers> saveCustomer(@RequestBody Customers customer) {
		return new ResponseEntity<>(service.saveCustomer(customer), HttpStatus.CREATED);
	}
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customers> getCustomerById( @PathVariable("cid") long cid) {
		return new ResponseEntity<>(service.getCustomerById(cid), HttpStatus.OK);
	}
	
	@PutMapping("/customer/{cid}")
	public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customer, @PathVariable("cid") long id) {
		return new ResponseEntity<>(service.updateCustomer(customer, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cid") long id) {
		
		service.deleteCustomer(id);
		 return new ResponseEntity<>("Customer deleted successully", HttpStatus.OK);
	}
}
