package com.demo;

class Shape {
	public void draw() {
		System.out.println("Drawing");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle Drawing");
	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Square Drawing");
	}
}

public class Main4 {

	public static void main(String[] args) {

		new Shape().draw();
		new Circle().draw();
		new Square().draw();
	}
}