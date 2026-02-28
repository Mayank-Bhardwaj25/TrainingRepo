package com.coforge.MavenDay4Prj;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class DemoOnBuiltInFI {
	public static void main(String[] args) {
		
		Supplier<String> strSupplier = ()-> {
			 return "Hello World";
		};
		System.out.println(strSupplier.get());
	

	
	
	Supplier<Double> randomSupplier = () -> {
		double randomValue = Math.random();
		return randomValue;
	};
	
	System.out.println(randomSupplier.get());
	
	
	Supplier<Integer> otpSupplier = () -> {
		Integer otp = (int) (Math.random() * 10000);
		return otp;
		
	};
	System.out.println(otpSupplier.get());
	
	
//	Supplier<Integer> evenSupplier = () -> {
//		
//		
//	};
	
	
	//-------CONSUMER----------	
	
	Consumer <String>  strConsumer = (str) -> {
		System.out.println(str.toUpperCase());
	};
	
	strConsumer.accept("Mayank");
	
	
	Consumer<Long> squareConsumer = (num) -> {
		System.out.println(num*num);
	};
	
	for(Long i=(long) 1; i<=10; i++) {
		squareConsumer.accept(i);
	}
	
	
	Consumer<Integer> factorialConsumer = (num) -> {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
			System.out.println(fact);
		}
	};
	factorialConsumer.accept(5);
	
	
	//----FUNCTION-----
	
	Function<Integer, Boolean> isEven = (num) -> {
		if(num%2 == 0)
			return true;
		else
			return false;
	};
	System.out.println(isEven.apply(54));
	
	
	//------Predicates -----
	
	Predicate<String> chkLength = (str) -> str.length() > 5;
	
	System.out.println(chkLength.test("Mayank"));
	
	Predicate<String> authenticateUsername = (uname) -> uname.equals("Mayank");
	Predicate<String> authenticatePassword = (pwd) -> pwd.equals("Mayank123");
	
	String res = authenticateUsername.test("Mayank") && authenticatePassword.test("Mayank123") ? "Authentication Successfull" : "Invalid credentials";
	System.out.println(res);
	
	//validation rules :-
	
	//username lenght must be more than 3 chars
	//username can not be null
	//username can not be blank..
	
	
	Predicate<String> Validateusername = (uname) -> uname.length() >3 && uname!=null && !uname.isBlank();
	System.out.println(Validateusername.test("MAYANK"));
   
	
			
			
	
	
	
	
	
}
}
