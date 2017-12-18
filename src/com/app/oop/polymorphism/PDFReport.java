package com.app.oop.polymorphism;

public class PDFReport implements Report {

	@Override
	public void generate() {
		System.out.println("Implementation relevant to generating PDF");
	}

}
