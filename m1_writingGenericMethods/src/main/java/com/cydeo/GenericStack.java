package com.cydeo;

import java.util.ArrayList;

public class GenericStack<E> { //Generic E type declared
    private ArrayList<E> list=new ArrayList<>(); // generic ArrayList

    public int getSize(){  // return the size of the list
        return list.size();
    }

    public E peek(){ // returns the top element in the stack
        return list.get(getSize()-1);
    }
    public E push(E o){
        list.add(o);
        return o;
    }

    public E pop(){
        E o=list.get(getSize()-1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
