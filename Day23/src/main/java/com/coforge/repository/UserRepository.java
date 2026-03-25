package com.coforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
