package com.gaurav;

public class Rectangle extends Shape{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	
	public static void main(String[] args) {
		try {
			Float f1 = new Float("3.0");
			int i = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(i+b+d);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}
