package Patterns;

import java.util.*;
// ye bhi sirf odd values of " n " k liye hi ban paega pattern
public class PatternThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a odd value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = n/2 + 1;
        int space = -1;
        
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
            if (row == 1 || row == n) {
                k = 2;
            }
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


