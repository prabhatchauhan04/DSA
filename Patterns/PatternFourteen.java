package Patterns;

import java.util.Scanner;

public class PatternFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int space = n-1;
        int number = 1;

        while (row <= n) {
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            int i = 1;
            while (i <= number) {
                System.out.print(row + " ");
                i++;
            }

            row++;
            space--;
            number += 2;
            System.out.println();
        }

    }
}
