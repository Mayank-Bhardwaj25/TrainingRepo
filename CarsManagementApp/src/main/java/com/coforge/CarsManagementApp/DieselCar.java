package com.coforge.CarsManagementApp;

public class DieselCar extends Car implements AddOns {

	@Override
	public void EngineType() {
		System.out.println("Deisel Engine Variant");
		
	}
	
	public void audioSystem() {
		System.out.println("Audio System is added with 8 speakers, woofers attached");
		
	}

	public DieselCar(String model) {
		super(model);
	}
	
	

}
