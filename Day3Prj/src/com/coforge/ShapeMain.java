package com.coforge;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String type;
		Shape sh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of shape");
		type = sc.next();
		
		if(type.equals("Circle")) {
			System.out.println("Enter the radius value");
			double r = sc.nextDouble();
			sh =  new Circle(r);
			sh.area();
			sh.circum();
		}
		
		else if(type.equals("Square")) {
			System.out.println("Enter the side");
			double s = sc.nextDouble();
			sh = new Square(s);
			sh.area();
			sh.circum();
		}
		else {
			System.out.println("Invalid Shape");
		}
		
		sc.close(); 
		
		
//		Circle c = new Circle(7);
//		c.area();
//		c.circum();
//		
//		Square s = new Square(5);
//		s.area();
//		s.circum();
//		
//		
//		Shape sh = new Circle(6);
//		sh.area();
//		sh.circum();
//		
//		sh = new Square(5);
//		sh.area();
//		sh.circum();
	}

}
