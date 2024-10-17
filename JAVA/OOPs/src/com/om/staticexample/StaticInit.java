package com.om.staticexample;

public class StaticInit {
    static int a = 4;
    static int b;

    //Static Block:- executed exactly once when the class is first loaded
    static {
        System.out.println("I'm in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();
        System.out.println(StaticInit.a + " " + StaticInit.b);

        StaticInit.b += 3;
        System.out.println(StaticInit.a + " " + StaticInit.b);
        StaticInit obj2 = new StaticInit();
        System.out.println(StaticInit.a + " " + StaticInit.b);
    }

}
