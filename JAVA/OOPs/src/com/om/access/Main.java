package com.om.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Om");
        //1. Access the data Members
        //2. Modify the data members.

        System.out.println(obj.getNum());

        obj.setNum(12);

        System.out.println(obj.getNum());
    }
}
