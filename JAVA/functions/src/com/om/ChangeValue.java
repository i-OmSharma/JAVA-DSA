package com.om;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //Array
        int[] arr = {1,5,7,12,4};
        changes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changes(int[] nums){
        nums[0]= 79;//If your make change to the object via this ref variable, same object will be changed.
    }
}