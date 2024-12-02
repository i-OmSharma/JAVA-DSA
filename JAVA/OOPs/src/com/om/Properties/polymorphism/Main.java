package com.om.Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        //Shapes circle = new Circle();//whats the type of the object that will be only at the use
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.area();
    }
}

//what variable it has access depends on the ref variable.
//Annotation is also a interface
//@Override --> interface.
