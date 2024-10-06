package com.om;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Syntax*/
        ArrayList<Integer> list = new ArrayList<>(5);//Generics is just what type of data u can store in this list object
        //here u cant pass the primitives , wrapper classes

//        list.add(24);
//        list.add(240);
//        list.add(21);
//        list.add(26);
//        list.add(554);
//        list.add(54);
//        list.add(964);
//        list.add(00);
//
////        System.out.println(list.contains(11));
//        System.out.println(list);
//
//        list.set(0,45);// index,value.
//
//        list.remove(3);
//        System.out.println(list);


        //Multi-intput
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //Output
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));// pass index here, list[index] syntax will will not work here.
        }

        System.out.println(list);
    }
}

/*Q. initial size is 5 or what ever , and u r inputing mor than that. how??size not fixed.
-->1.size is fixed internally.
2.array list fill by some amount.It will create new list of double empty size.
3.old elements are copied in new list , old one is deleted.
Amortized
*/






