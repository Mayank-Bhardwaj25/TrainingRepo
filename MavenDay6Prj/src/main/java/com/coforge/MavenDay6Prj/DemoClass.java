package com.coforge.MavenDay6Prj;

public class DemoClass {
	
	public static void Calculate() {
		int a=5, b=0;
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
	}
	

	public static void checkAge(int age) throws AgeNotSufficientException {
		if(age>35)
			System.out.println("Eligible to register plus two");
		else
			throw new AgeNotSufficientException("Not sufficient");
			
	}
	public static void main(String[] args) {
		
		try {
			
			Calculate();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic exception handled");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		try {
			checkAge(17);
			
		} catch (AgeNotSufficientException e) {
			// TODO: handle exception
			System.out.println("Age exception handled");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		}
		
		System.out.println("application completed");
		
		

	}

}
