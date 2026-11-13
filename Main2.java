package com.demo;

public class PrintData {

    public void print(int a) {
        System.out.println("Integer Data : " + a) ;
    }

    public void print (String a) {
        System.out.println("String Data : " + a) ;
    }

    public void print (double a) {
        System.out.println("Double Data : " + a) ;
    }

    public static void main(String[] args) {
        PrintData pd = new PrintData();

        pd.print(100);
        pd.print("Hello Java");
        pd.print(99.99);
    }
}
