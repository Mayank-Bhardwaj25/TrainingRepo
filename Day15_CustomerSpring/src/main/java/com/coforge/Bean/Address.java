package com.coforge.Bean;

public class Address {

	private String hno;
	private String street;
	private String city;
	private String state;
	private String pincode;
	public Address() {
		super();
	}
	public Address(String hno, String street, String city, String state, String pincode) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
}
