package com.om.introduction;

//class = named group of property and functions
//class is a template of an object.-logical construct
//object = object is an instance of a class-physical reality
//class creates a datatype,we can use to create objects.
//when we declare object of a class,we are creating instance of that class
//object have some physical reality, occupy some space in the memory.

//Objects are categorized in:
//1.State of the Object-its value from its datatype ;
// 2.Identity od the Object-weather one obj is different from other(like where the value is stored in the memo);
// 3.Behaviour of the  object-Effect of the datatype operations

//variable inside the objects are known as instance variable
//new operator dynamically allots memory at run time and return a reference to it
//and that reference is stored in the desired variable
//hence all class objects in java must be allocated dynamically

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 student: {roll no, name, marks}

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //Student om;
        //System.out.println(om.rno);
        //System.out.println(Arrays.toString(students));

        //just declaring
        //Student om;
        //om = new Student();
        Student om = new Student(21, "kuku", 62.4f);
//        om.rno = 21;
//        om.name = "Om";
//        om.marks = 66.6f;

//        System.out.println(om.rno);
//        System.out.println(om.name);
//        System.out.println(om.marks);

//        om.changeName(" hii");
//        om.greeting();
        Student random = new Student();
        System.out.println(random.name);
    }
}
//  create a class
//for every single student
class Student {
    int rno;
    String name;
    float marks;

    void greeting () {
        System.out.println("hello" + name);
    }

    void changeName (String newName) {
        name = newName;
    }

//    Student () {
//        this.rno = 21;
//        this.name = "Om";
//        this.marks = 66.6f;
//    }

    Student (int roll, String naam, float marks) {
        this.rno = roll;
        this.name = naam;
        this.marks = marks;
    }
//        Student jack =new Student(1,"Jack", 77.2f)
//    here this will replace with jack and jack.roll = roll which is 1,and similarly everything will be replaced.
//    Student (int roll, String naam, float marks) {
//        this.rno = roll;
//        this.name = naam;
//        this.marks = marks;
//    }

    //calling constructor using another constructor using this.
    // internally: new Student(13, "box", 99.7f);
    Student () {
        this (13, "box", 99.7f);
    }
}

//  Clg code:

//class Shape {
//    int l, b, h;
//    Shape(int p, int q, int r) {
//        l = p;
//        b = q;
//        h = r;
//    }
//
//    void volume () {
//        System.out.println("The volume is" + (l*b*h));
//    }
//}
//class Demo1 {
//    public static void main (string s[]) {
//        shape s1 = new shape (10, 9, 3);
//        shape s2 = new shape (3, 2, 1);
//        shape s3 = new shape (4, 3, 2);
//        s1.volume();
//        s2.volume();
//    }
//}