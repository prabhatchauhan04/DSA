package Basics;

import java.util.Scanner;

public class PrintingNthFibterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int n = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.print("Nth term of fib series is : " + a);
    }
}