package Patterns;

import java.util.Scanner;

public class PatternEighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int space = n-1;
        int star = 1;
        int val = 1;

        while (row <= 2*n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int p = val;
            while (j <= star) {
                System.out.print(p + "\t");
                if (j <= star/2) {
                    p++;
                } else {
                    p--;
                }
                j++;
            }

            row++;
            if (row <= n) {
                star += 2;
                space--;
                val++;
            } else {
                star -= 2;
                space++;
                val--;
            }
            System.out.println();
        }
    }
}
