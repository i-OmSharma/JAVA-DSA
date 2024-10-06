package com.om;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        //[2,3,4]
//        System.out.println(arr[1]);

        /*Input using for loop*/
//        for (int i = 0; i < arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
//
//        for (int No : arr) {//for every element in array print the element.
//            System.out.println(No + " ");//No represents element of array
//        }
//
//        System.out.println(arr[4]);//index out of bound error

        /*Array of Objects*/
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
//        //modify
        str[3] = "Anar";
        System.out.println(Arrays.toString(str));

        for (int element : arr){
            System.out.println(element);
        }
    }
}