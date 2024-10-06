package com.om;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         *   1 2 3
         *   4 5 6
         *   7 8 9
         */

//        int[][] arr = new int[][];//No of rows(1st[]) mandatory, not columns(2nd[])
//
//        int[][] arr2d = {
//                {1, 2, 3},//0th index
//                {4, 5, 6},//1st index
//                {7, 8, 9} //2nd index -> arr[1][2] = {4, 5, 6}{6}

        /*Individual can have different stuff*/
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        }

        int[][] arr = new int[3][3];
        System.out.println(arr.length);//no of rows
        //input

        for (int row = 0; row < arr.length; row++){
            //for each & every column
            for (int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }


        //output
//        for (int row = 0; row < arr.length; row++){
//            //for each & every column
//            for (int col = 0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }



        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}