package Basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        sc.close();

        int Sum = 0;
        while (n > 0) {
            int rem = n % 10;
            Sum = Sum + rem;
            n = n / 10;
        }

        System.out.println("Sum of Digits of entered number is : " + Sum);
    }
}
