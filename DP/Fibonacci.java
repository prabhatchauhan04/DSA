package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        // n+1 size bcoz hum fib(n) humare nth index pr store krenge .
        int[] dp = new int[n+1];
        System.out.println(fiboTD(n , dp));
        System.out.println(fiboBU(n));
    }
    // Top Down
    public static int fiboTD(int n , int[] dp){
        if (n == 0 || n == 1) {
            return n;
        }
        // agar default value(0) ki jagah updated value hai toh whi return krdenge
        if (dp[n] != 0) {
            return dp[n];
        }
        int f1 = fiboTD(n-1 , dp);
        int f2 = fiboTD(n-2 , dp);
        return dp[n] = f2+f1; // values yaad kra rhe in dp array
    }
    // Bottom Up
    public static int fiboBU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i < dp.length ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
