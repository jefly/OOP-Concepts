package com.app.oop.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Duck cityDuck = new CityDuck();
		cityDuck.display();
		
		Duck wildDuck = new WildDuck();
		wildDuck.display();
	}
}
