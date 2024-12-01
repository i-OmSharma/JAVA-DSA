package com.om.abstractDemo;

public abstract class parent {

    int age;
    
    final int VALUE; //can't use it to call directly to create an obj, it should be passed in another constructor.
    public parent(int age) {
        this.age = age;
        VALUE = 239773;
    }

    //Creating Static methods in Abstract class

    static void hello( ) {
        System.out.println("HEY");
    }

    void normal() {
        System.out.println("Normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}
