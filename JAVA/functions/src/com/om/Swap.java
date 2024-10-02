package com.om;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap num
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);

        System.out.println(a+" "+b);

        String name = "Deepu";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String nam){
        nam = "Anar Dana";//Creating new Object here
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        //this changes will only be valid in this function scope only.
    }
}