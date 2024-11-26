package com.om.accessDemo;

public class son extends parent {

    public son(int age) {
        this.age = age;
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
