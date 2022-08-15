package com.cydeo;

public class Printer <T extends Animal>{// T is type parameter angle brackets
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        thingToPrint.speak();
        System.out.println(thingToPrint);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "thingToPrint=" + thingToPrint +
                '}';
    }
}
