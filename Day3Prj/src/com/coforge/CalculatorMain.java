package com.coforge;

public class CalculatorMain {
	
 public static void main(String args[]) {
	 
	 Calculator c = new Calculator();
	 System.out.println(c.add(30, 20));
	 
	 System.out.println(c.sub(30, 20));
	 
	 System.out.println(c.mul(30, 20));
	 
	 c.div(40, 20);
	 
	 c.power(65, 2);
	 c.squareRoot(144);
	 c.logValue(10);
 }
	

}
