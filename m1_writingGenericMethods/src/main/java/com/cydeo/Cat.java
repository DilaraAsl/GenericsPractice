package com.cydeo;

public class Cat extends Animal{
    @Override
    public String speak() {
      return  getClass().getSimpleName()+" says"+" meow ";
    }
}
