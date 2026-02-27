package com.coforge;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("This is default Constructor");
	}

	public Person(String name, int age) {
		this();
		this.name = name.toUpperCase();
		this.age = age;
	}

	
	
	public Person(String name) {
		
		this(name,20);
		System.out.println("Constructor with one parameter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
   
}
