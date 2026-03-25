package com.coforge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.User;
import com.coforge.repository.UserRepository;

@Service
public class UserService {
 @Autowired
 UserRepository userrepo;
 
 public List<User> getAllUsers() {
	 
	return  userrepo.findAll();
 }
 
 public User saveUser(User user) {
	 
	 return userrepo.save(user);
 }
	
 public User FindById(long id) {
	 
	 return userrepo.findById(id).orElseThrow(() -> new RuntimeException());
 }
}
