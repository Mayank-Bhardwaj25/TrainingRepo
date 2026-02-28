package com.coforge;

public class Circle extends Shape{
	double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Circle Area:" +3.14*this.radius*this.radius);
	}
	
	public void circumference() {
		System.out.println("Circle Circumference : " +2*3.14*radius);
	}
 
}
