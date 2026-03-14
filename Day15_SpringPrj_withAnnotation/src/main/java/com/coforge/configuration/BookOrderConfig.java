package com.coforge.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.Beans.Book;
import com.coforge.Beans.Order;

@Configuration
public class BookOrderConfig {
	
	@Bean(name = "ord")
	public Order getOrderBean() {
		return new Order(345,5, 43434, getBookBean() );
		
	}
	
	@Bean(name = "book")
	public Book getBookBean() {
		
		String authArr[] = {"Mayank", "Rajat", "Gaurav"};
		List<String> authorList =Arrays.asList(authArr);
		
		
		Book b = new Book(123, "PythonTutorials", 600.0, authorList);
		return b;
	}

}
