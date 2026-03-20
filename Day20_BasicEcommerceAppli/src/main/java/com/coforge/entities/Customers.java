package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cid;
	private String cname;
	private String address;
	private long mobile;
	private String email;
	public Customers(String cname, String address, long mobile) {
		super();
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
	}
	public Customers(String cname, String address, long mobile, String email) {
		super();
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	
 
	
	
}
