package com.coforge.Beans;

public class HelloBean {
	private String name;
	
	
public HelloBean() {
		super();
	}


public HelloBean(String name) {
	super();
	this.name = name;
}


public void sayHello() {
	System.out.println("Hello....");
}

public void printName() {
	System.out.println(this.name);
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "HelloBean [name=" + name + "]";
}




}
