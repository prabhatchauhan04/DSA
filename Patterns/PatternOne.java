package Patterns;

public class PatternOne {
    public static void main(String[] args) {
        int n = 5; //Number of Rows
        int row = 1; // 1st row
        int star = 1; // no. of stars in 1st row

        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
            star++;
        }

    }
}
