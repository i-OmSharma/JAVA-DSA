package com.om;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        ni(2,3,5,8);

        mix(5,6,"Zebra");//all the args should be given like the same as given in method.

    }

    //mix argument
    static void mix(int a, int b, String... w) {
        System.out.println( a);
        System.out.println( b);
        System.out.println( Arrays.toString(w));
    }





    static void ni(int...z){//int...z-->Taking Array of string.
        System.out.println(Arrays.toString(z));
    }
}