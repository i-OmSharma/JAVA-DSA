package com.om;

public class Scope {
    public static void main(String[] args) {
        int a = 10;//decelerating->adding data type.
        int b = 20;
//Scoping--> Any thing initialised outside can be used inside, but anything initialised inside u cam't use outside.
//          initialised inside and be initialised outside
        {
            //2.Block Scope--> values initialised in this block, will remain in block

//          int a = 31;// already initialised outside the bloack in the same methid,hence u can't initialised it again
            a = 21;//updating //reassign the original ref variable to same other value
            int c = 12;
            System.out.println(a);
        }
//        System.out.println(c);//2.Block Scope--> values initialised in this block, will remain in block


//      3.Scoping for loops
        for (int i = 0; i < 2;i++){
            System.out.println(i);
            int num = 60;
        }
//        System.out.println(num);-->u can't initialised inside loop can be accessed inside the loop.
    }
    static void random(){
//        System.out.println(a);//1. Function Scope-->if u declare variable inside the fumction u
//                                                    can acess them inside those function only
    }
}