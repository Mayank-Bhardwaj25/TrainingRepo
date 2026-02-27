package com.coforge.CarsManagementApp;

public class PetrolCar extends Car implements AddOns {

	@Override
	public void EngineType() {
		
		System.out.println("Petrol Variant Engine");
		
	}
	
	public void audioSystem() {
		System.out.println("Audio system is with 6 speaker , woofers added");
	}

	public PetrolCar(String model) {
		super(model);
	}
	
	//this is to call warranty policy through specific class like PetrolCar, DieselCar. 
	

}
