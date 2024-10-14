package com.om;

public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = {2, 3, 5, 9, 14, 16, 18};
        char target = 'a';
        int  ans = SmallestNumber(letters, target);
        System.out.println(ans);

    }
    static int SmallestNumber(char[] letters, int target){
        int start = 0;
        int end  = letters.length - 1;


        while (start < end){
            //int mid = (start + end ) / 2;

            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}



/*Leet-code problem*/