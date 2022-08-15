package com.cydeo;

public class GenericMethodDemo {
    public static void main(String[] args) {
        String[] names={"Alfonso,","Beatrice","Celine",};
        displayArray(names);
    }
    public static <E> void displayArray(E[] names){
        for(E each:names){
            System.out.println(each);
        }
    }
}
