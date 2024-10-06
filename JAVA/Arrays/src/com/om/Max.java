package com.om;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 12, 5, 9};
        System.out.println(max(arr, 1,3));
    }

    //static value
//    static int max(int[] arr){
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;

    //in range
    static int max(int[] arr, int start , int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}