//sum of n natural numbers using recursion

package RecursionUdemy;

import java.util.Scanner;

public class Sumofn{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("(Sum of first n Natural Numbers) Value of n : ");
        int n = scn.nextInt();
        System.out.println(Sum(n));
        scn.close();
    }

    public static int Sum(int n){
        if (n == 0) {
            return 0;
        } else {
            return (Sum(n-1) + n);
        }
    }

}