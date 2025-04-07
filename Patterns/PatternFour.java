package Patterns;

import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = 1;
        int space = n-1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("*  ");
                j++;
            }

            row++;
            space--;
            star = star + 2;
            System.out.println();
        }
    }
}
