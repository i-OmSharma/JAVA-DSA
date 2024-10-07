package com.om;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums ){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //check even digit or not
    static boolean even(int num) {
        int numberofdigits = digits(num);

//        if (numberofdigits % 2 == 0){
//            return true;
//        }
//        return false;

        return numberofdigits % 2 == 0;

    }
    //count number of digits
    static int digits(int num) {
        int count = 0;

        if (num < 0){
            num = num * -1;
        }

        if (num == 0) {
            return -1;
        }

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}