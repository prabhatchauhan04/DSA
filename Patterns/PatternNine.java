package Patterns;
//Mirroring
import java.util.Scanner;

public class PatternNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        int star = 1;
        
        while (row <= 2*n-1) {
            int i = 1;
            while (i <= star) {
                System.out.print("*  ");
                i++;
            }

            row++;
            if (row <= n) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}
