package com.app.oop.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		
		Report report = new PDFReport();
		report.generate();
		
		report = new ExcelReport();
		report.generate();
	}
}
