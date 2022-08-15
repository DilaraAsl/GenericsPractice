package com.cydeo;

import java.util.Arrays;

public class SwapDemo {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4};
        swap(a,0,2);
        String[] str={"Goleta", "Santa Barbara","Houston","Fort Lee"};
        swap(str,2,3);
    }
    public static <T> void swap(T[] a,int x,int y){
        T temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        System.out.println(Arrays.toString(a));

    }
}
