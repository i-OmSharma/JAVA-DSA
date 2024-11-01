package com.om.Properties.polymorphism;

public class Circle extends Shapes{


    //this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override  // this is called annotation-basically if you want to check whether a method is Overriden or not
              // just put override above it
    void area() {
        System.out.println("Area is pie * r * r");
    }
}
