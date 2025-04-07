package Basics;

import java.util.Scanner;

public class CheckingIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        int counter = 0;

        for (int i = 2 ; i < n ; i++) {
            if (n % i == 0) {
                counter++;
                break;
            }
        }

        if (counter >= 1) {
            System.out.println("Number is not prime.");
        } else {
            System.out.println("Number is prime.");
        }

    }
}
