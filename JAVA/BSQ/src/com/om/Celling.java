package com.om;

public class Celling {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 91;
        int ans = celling(arr, target);
        System.out.println(ans);

    }
    static int celling(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;

        if (target > arr[arr.length - 1]){
            return -1;
        }

        while (start <= end){
            //int mid = (start + end ) / 2;

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;

    }
}