package com.om;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
        int ans = sum3(5,6);
        System.out.println(ans);
    }
    //Arguments-->pass the value of number when you calling the method in main()
    static int sum3(int p , int v){
        int sum = p + v;
        return sum;
    }

    // Retuen integer.
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = in.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.print("SUM = "+sum);

    }
}