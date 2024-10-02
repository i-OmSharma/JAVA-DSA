package com.om;

public class OverLoading {
    //two or more functions / methods have same name , return type etc...can exist if para/args are different or no of args should be different
    //At compile time its going to determine which function is to be run , weather its int or name
    public static void main(String[] args) {
        six(9);
        six("Zebra");
//        six();//Ambiguity : the possibility of being understood in more than one way, something that can be understood in more than one way.
        //at compile time , here is no data so it will show error
        //It can't be empty when OverRiding VarArgs.
    }

    static void six(int a){
        System.out.println(a);

    }


    static void six(String name){
        System.out.println(name);


    }


}