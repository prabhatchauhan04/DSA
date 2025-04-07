package Basics;

import java.util.Scanner;

/*  Conditions : (i)   Every digit will be unique in a number
                 (ii)  for a n digit number , we will only use 1 to n numbers as its digit .
                       Example -> for a 3 digit number , we can only use '1' , '2' and '3'. Like 123 or 321 or 231 etc.
*/

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int pos = 1;
        int Sum = 0;

        while (n > 0) {
            int rem = n % 10;
            Sum = (int) ( Sum + (pos * Math.pow(10 , rem - 1)) ); // typecasted to int because pow function gives result in double datatype.
            n = n / 10;
            pos++;
        }

        System.out.println("Inverse of entered number is : " + Sum);
    }

}
