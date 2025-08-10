package com.om;
import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();



        switch (empId) {
            case 1 :
                System.out.print("Kunal");
                break;
            case 2 :
                System.out.print("Mohit");
                break;
            case 3 :
                System.out.println("Emp no 3");

                String department = in.next();

                switch  (department) {
                    case "IT":
                    System.out.println("IT");
                    break;

                    case  "Managemnt":
                        System.out.println("Managment");
                        break;
                    default:
                        System.out.println("Enter a valid department");
                }
                break;

            default:
                System.out.println("Enter a valid empId ");
        }
    }
}