package com.om.packages.a;

import static com.om.packages.b.Message.message; //we can import only the public items, not the privet or other ones.

public class Greeting { 
    public static void main(String[] args) {
        System.out.println("hello");
        message();
    }
}

