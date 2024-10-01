package com.om;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enetr the value of n: ");
        int n = in.nextInt();

        int p = 0;
        int c = 1;
        int count = 2;

        while(count <= n){
            int temp = c;
            c = c + p;
            p = temp;
            count++;
        }
        System.out.println("The fibo number is:");
        System.out.println(c);
    }
}