package com.om;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {0, -3, -5, -7, -12, -15, -21, -27};
        int target = -12;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderagnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        // Find weathe the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];


        while (start <= end){


            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }  else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
//
