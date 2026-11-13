package com.demo;

class AreaCalculator{
	public double area(double radius) {
		return 3.14 * radius * radius;
	}
	
	public double area(double base, double height) {
		return (base*height)/2;
	}
	
	public double area(int length, double width) {
		return length * width ;
	}
}

public class Main1 {
	public static void main(String[] args) {
		AreaCalculator a = new AreaCalculator();
		System.out.println("Area of Circle: " + a.area(12.46));
		System.out.println("Area of trianle : " + a.area(25.0, 65.12));
		System.out.println("Area of rectangle: " + a.area(65, 98.0));
	}
}
