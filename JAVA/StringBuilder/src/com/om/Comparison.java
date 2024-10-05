package com.om;

public class Comparison {
    public static void main(String[] args) {
//        String a = "Om";
//        String b = "Om";
//        String c = a;

        // ==
        //.equals :- method or function to check the Objects value

//        System.out.println(c == a & c == b);

//        how to create different object of the same value.
        String name1 = new String("Om");
        String name2 = new String("Om");
//        System.out.println(name2 == name1);
        System.out.println(name2.equals(name1));

        System.out.println(name1.charAt(0)); 

    }
}
