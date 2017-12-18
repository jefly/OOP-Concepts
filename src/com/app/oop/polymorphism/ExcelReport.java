package com.app.oop.polymorphism;

public class ExcelReport implements Report {

	@Override
	public void generate() {
		System.out.println("Implementation relevant to generating Excel");
	}

}
