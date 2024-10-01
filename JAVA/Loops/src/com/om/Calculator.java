package com.om;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.println("Enter your orpeator");

            char op = in.next().trim().charAt(0);

            System.out.println();

            if (op == '+' || op == '-' || op =='*' || op == '/' || op =='%'){
                System.out.print("Enter two Numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                System.out.println();

                if (op == '+'){
                    ans = n1 + n2;
                }

                if (op == '-'){
                    ans = n1 - n2;
                }

                if (op == '*'){
                    ans = n1 * n2;
                }

                if (op == '/'){
                    if (n2 != 0){
                        ans = n1 / n2;
                    }
                }

                if (op == '%'){
                    ans = n1 % n2;
                }

            } else if (op == 'X' || op =='x') {
                break;
            } else {
                System.out.println("Invalid Orperator");
            }
            System.out.println(ans);
        }

    }
}