package com.demo;

class Calculator{
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public double add(double num1, double num2) {
		return num1 + num2;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		System.out.println("Sum of two integer numbers: " + c1.add(25, 45));
		System.out.println("Sum of three integer numbers: " + c1.add(24, 65, 98));
		System.out.println("Sum of two double numbers: " + c1.add(45.6, 95.89));
	}
}
