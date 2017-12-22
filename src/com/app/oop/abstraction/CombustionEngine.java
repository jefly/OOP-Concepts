package com.app.oop.abstraction;

public class CombustionEngine {
	
	private void engageChoke(){
		System.out.println("Engaging choke..");
	}
	
	private void disengageChoke(){
		System.out.println("Disengaging choke..");
	}
	
	private void engageElectricSystem(){
		System.out.println("Engaging electric system..");
	}

	private void powerSolenoid(){
		System.out.println("Powering soleniod..");
	}
	
	private void provideFuel(){
		System.out.println("Providing fuel..");
	}
	
	private void provideSpark(){
		System.out.println("Providing spark..");
	}
	
	public void start(){
		
		engageChoke();
		engageElectricSystem();
		powerSolenoid();
		provideFuel();
		provideSpark();
		disengageChoke();
	}
	
	public void stop(){
		
	}
}
