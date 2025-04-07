package DataTypes;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in decimal number system : ");
        int n = sc.nextInt();
        sc.close();

        int Sum = 0;
        int mul = 1;

        while (n > 0) {
            int rem = n % 2;
            Sum = Sum + (rem * mul);
            n = n / 2;
            mul = mul * 10;
        }

        System.out.print("The entered number in binary number system is : " + Sum);
    }
}