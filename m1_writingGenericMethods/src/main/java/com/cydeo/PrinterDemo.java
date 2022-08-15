package com.cydeo;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer<Cat> printName=new Printer<>(new Cat());
       // Printer<Integer> printInt=new Printer<>(12);


        System.out.println(new Cat().speak());
        printName.print();

    }
}
