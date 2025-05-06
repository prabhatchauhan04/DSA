package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        // n+1 size bcoz hum fib(n) humare nth index pr store krenge .
        int[] dp = new int[n+1];
        System.out.println(fibo(n , dp));;
    }
    public static int fibo(int n , int[] dp){
        if (n == 0 || n == 1) {
            return n;
        }
        // agar default value(0) ki jagah updated value hai toh whi return krdenge
        if (dp[n] != 0) {
            return dp[n];
        }
        int f1 = fibo(n-1 , dp);
        int f2 = fibo(n-2 , dp);
        return dp[n] = f2+f1; // values yaad kra rhe in dp array
    }
}
