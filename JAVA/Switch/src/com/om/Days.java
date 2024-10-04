package com.om;
import java.util.Scanner;

import static java.lang.System.in;

public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        //            case 1 -> System.out.println("Monday");
        //            case 2 -> System.out.println("Tuesday");
        //            case 3 -> System.out.println("Wednesday");
        //            case 4 -> System.out.println("Thursday");
        //            case 5 -> System.out.println("Friday");
        //            case 6 -> System.out.println("Saturday");
        //            case 7 -> System.out.println("Sunday");
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//            default:
//                System.out.println("Enter valid no of days");
//                break;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Enter valid no of days");
        }


    }
}