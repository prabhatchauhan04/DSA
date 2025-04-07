package Patterns;

import java.util.Scanner;

public class PatternEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = n;
        int space = n-1;
        
        while (row <= 2*n-1) {
            int j = 1;
            while (j <= space) {
                System.out.print("   ");
                j++;
            }
            int i = 1;
            while (i <= star) {
                System.out.print("*  ");
                i++;
            }

            row++;
            if (row <= n) {
                star--;
                space--;
            } else {
                star++;
                space++;
            }
            System.out.println();
        }
    }
}
