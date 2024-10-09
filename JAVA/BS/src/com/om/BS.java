package com.om;

public class BS {
    public static void main(String[] args) {
        int[] arr = {-19, -17, -11, -7, -1, 3, 5, 13, 17};
        int target = 1;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;

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
        return -1;
    }
}
