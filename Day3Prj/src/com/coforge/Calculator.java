package com.coforge;

public class Calculator implements SimpleCalculatorInterface, ScientificCalcInterface {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public long mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public void div(int a, int b) {
		System.out.println((float)(a/b));
		
	}

	@Override
	public void power(double a, double d) {
		System.out.println(Math.pow(a, d));
		
	}

	@Override
	public void squareRoot(double d) {
		System.out.println(Math.sqrt(d));
		
	}

	@Override
	public void logValue(double num) {
		System.out.println(Math.log10(num));
		
	}
	
 
}
