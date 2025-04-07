package Patterns;

import java.util.Scanner;

public class PatternSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int space = n-1;
        int star = 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int val = 1;
            while (j <= star) {
                System.out.print(val + "\t");
                j++;
                if (j <=  star/2 + 1) {
                    val++;
                } else {
                    val--;
                }
            }

            row++;
            space--;
            star += 2;
            System.out.println();
        }
    }
}
