package Patterns;

import java.util.Scanner;

//ye pattern sirf odd value of " n " k liye bn paega . so input odd hi lena
public class PatternTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a odd value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = n/2;
        int space = 1;
        
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
            while (k <= star) {
                System.out.print("*  ");
                k++;
            }

            row++;
            if (row <= n/2 + 1) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
