package Patterns;

import java.util.Scanner;

public class PatternSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = 1;
        int space = 2 * n - 3;

        while (row <= n) {
            int i = 1;
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
            if (row == n) {
                k = 2;
            } // this will help us avoid printing an extra star at the last row at the end.
            while (k <= star) {
                System.out.print("*  ");
                k++;
            }

            row++;
            space = space - 2;
            star++;
            System.out.println();
        }
    }
}
