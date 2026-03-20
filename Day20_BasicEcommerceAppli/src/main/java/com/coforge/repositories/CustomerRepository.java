package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long> {
	

}
