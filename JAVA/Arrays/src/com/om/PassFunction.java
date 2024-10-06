package com.om;

import java.util.Arrays;

public class PassFunction {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6};
        System.out.println(Arrays.toString(nums));

        changes(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void changes(int[] smun){
        smun[2] = 88;
    }

}

//Arrays are Mutable
//strings are immutable