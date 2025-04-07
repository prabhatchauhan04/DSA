package Patterns;

import java.util.Scanner;

public class PatternEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = n;
        int space = -1;

        while (row <= n) {
            int i = 1;
            if (row == 1) {
                i = 2;
            }// taki ek star less print ho in first row 
            while (i <= star) {
                System.out.print("*  ");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("   ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                System.out.print("*  ");
                k++;
            }

            row++;
            space += 2;
            star--;
            System.out.println();
        }
    }
}
