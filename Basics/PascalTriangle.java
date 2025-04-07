package Basics;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        
        int star = 1;
        int row = 0;
        int space = n-1;

        while (row < n) {
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }
            int i = 0;
            int val = 1;
            while (i < star) {
                System.out.print(val + "\t\t");
                val = ((row - i) * val)/ (i + 1);
                i++;
            }

            row++;
            star++;
            space--;
            System.out.println();
            System.out.println();
        }
    }
}
