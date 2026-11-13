package com.demo;

public class Student {

    public void displayDetails(String name) {
        System.out.println("Name : " + name) ;
    }

    public void displayDetails (String name, int rollNo) {
        System.out.println("Name : " + name + " | Roll No : " + rollNo) ;
    }

    public void displayDetails (String name, int rollNo, double marks) {
        System.out.println("Name : " + name + " | Roll No : " + rollNo + " | Marks : " + marks) ;
    }

    public static void main(String[] args) {
        Student std = new Student();

        std.displayDetails("Ram");
        std.displayDetails("Sita", 101);
        std.displayDetails("Laxman", 102, 95.5);
    }
}
