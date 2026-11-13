package com.demo;

class Employee{
	public double getSalary(double salary) {return salary;}
}

class Manager extends Employee{
	public double getSalary(double salary) {return salary;}
}

public class Main6 {
	public static void main(String[] args) {
		Employee em = new Manager();
		double salary = em.getSalary(25000.00);
		System.out.println("Salary: " + salary);
	}
}