package com.om;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 45, 68},
                {55, 45, 3, 8},
                {98, 33, 11, 5}
        };
        int target = 3;
//        int[] ans = search(arr, target);//format of return value {row,column}
//        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
//    static int[] search(int[][] arr, int target){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
}
