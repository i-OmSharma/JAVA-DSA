package com.om;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter ur name : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String  perso = greet(name);
        System.out.println(perso);

    }



    static String greet(String name){
        String msg = "U R.I.P "+ name;
        return msg;
    }
    static void greeting(){
        System.out.println("U R.I.P");
    }
}