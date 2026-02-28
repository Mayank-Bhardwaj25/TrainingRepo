package com.coforge.MavenDay4Prj;

public class CalculatorApp { //implements CalculatorInterface {

//	public void add(int a, int b) {
//		// TODO Auto-generated method stub
//		System.out.println("Sum :-" + a+b);

	
	public static void main(String[] args) {
		//passing parameter to lamda and not returning.
		
//		CalculatorInterface ci = (a, b) -> {
//			System.out.println("The Sum is :- "+ a+b);
//		};
//		ci.add(50, 50);
		
		//passing parameters and having return
		//if we remove curly braces we donot need to return the value
		
//		CalculatorInterface ci = (a, b) -> {
//			return a-b;
//		};
//		System.out.println(ci.sub(67, 35));
		
		
//		CalculatorInterface ci = () -> {
//			int a = 6, b=9;
//			return a*b;
//		};
//		System.out.println(ci.mul());
		
		
		CalculatorInterface ci = () -> {
			float a = 72, b=4;
			System.out.println("Result :- " +a/b);
		};
		ci.div();
	}

}
