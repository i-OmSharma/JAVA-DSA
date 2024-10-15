package com.om.introduction;

//*In JAVA there is no such pass by reference ,everything is pass by value.
//*In primitives pass by value is value
//*when you pass object reference value is passed, its "pass by reference value"

import org.w3c.dom.ls.LSOutput;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45 ;

        Integer a = 10;
        Integer b = 20;


        swap(a,b);
        System.out.println(a+" "+b);

        final A om = new A("Sand");
        om.name = "Other name";
        // When a non premitive is final u can not reassign it.
//    om = new A("Other name");

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name  = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

