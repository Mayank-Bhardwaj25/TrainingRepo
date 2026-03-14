package com.coforge.Bean;

public class Customer {
	
    private long cid;
	private String cname;
	private Address address;
	private String mobile;
	private String email;
	public Customer() {
		super();
	}
	public Customer(long cid, String cname, Address address, String mobile, String email) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", mobile=" + mobile + ", email="
				+ email + "]";
	}
	
	
	
	
}
