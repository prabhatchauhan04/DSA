package Functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        sc.close();

        boolean Answer = IsArmstrongNumber(n);

        System.out.print("Is given number Armstrong : " + Answer);
    }

    public static int numberofdigits(int num){
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static boolean IsArmstrongNumber(int n){
        int sum = 0;
        int number = n;
        int c = numberofdigits(n);

        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, c));
            n = n / 10;
        }

        if (number == sum) {
            return true;
        } else {
            return false;
        }
    }

}