package com. om.abstractDemo;

public class son extends parent {
//Contructor
    public son(int age) {
        super(age);
    }


    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " She is " + age);
    }
}
