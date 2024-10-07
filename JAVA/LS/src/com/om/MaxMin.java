package com.om;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 3, 6, 8, 31, 9};
        System.out.println(min(arr));

    }

    //assume arr.length != 0
    //return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

