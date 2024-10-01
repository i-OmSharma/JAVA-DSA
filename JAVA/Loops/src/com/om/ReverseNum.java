package com.om;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 56473;

        int ans = 0;
        while(n>0){
            int rem = n % 10;
            n/= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }

}