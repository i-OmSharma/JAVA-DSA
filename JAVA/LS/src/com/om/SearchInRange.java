package com.om;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums= {9, 45, 65, -98, 11, 2, 6};
        int target = 11;
        int ans = linearSearch(nums, target, 1, 4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop

        for (int index = start; index <= end; index++) {
            //check the element at every index if it is = target.
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found.
        return -1;
    }

}