package com.om;

import java.util.Scanner;

public class ArmsNno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int n = in.nextInt();
//        System.out.println(isArm(n));

        for (int i = 100; i<=1000; i++){
            if (isArm(i)){
                System.out.print(i +" ");
            }

        }

    }
    static boolean isArm(int n){
        int t = n;
        int s = 0;
        while (n > 0){
            int r = n % 10;
            n = n / 10;
            s = s + (r*r*r);
        }
        return s == t;
    }
}