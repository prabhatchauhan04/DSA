package DP;

import java.util.Arrays;

/* 0-1 Knapsack Problem 
  The famous knapsack problem. You are packing for a vacation on the sea side and you are going to carry only one bag with capacity S (1 <= S <= 1000). 
  You also have N (1<= N <= 1000) items that you might want to take with you to the sea side. Unfortunately you can not fit all of them in the knapsack 
  so you will have to choose. For each item you are given its size and its value. 
  You want to maximize the total value of all the items you are going to bring. What is this maximum total value?
 */

public class Knapsack0_1 {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 3, 2, 2 }; // weight
		int[] val = { 8, 4, 0, 5, 3 }; // value
		int cap = 4; // capacity
		System.out.println(Knapsack(wt, val, cap, 0));
        int[][] dp = new int[cap+1][wt.length];
        for (int[] arr : dp) {
            Arrays.fill(arr , -1);
        }
        System.out.println(KnapsackTD(wt, val, cap, 0, dp));
    }
    public static int Knapsack(int[] wt, int[] val, int cap, int idx) {
		if (cap == 0 || idx == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + Knapsack(wt, val, cap - wt[idx], idx + 1);
		}
		exc = Knapsack(wt, val, cap, idx + 1);
		return Math.max(inc, exc);
	}
    public static int KnapsackTD(int[] wt, int[] val, int cap, int idx , int[][] dp) {
		if (cap == 0 || idx == wt.length) {
			return 0;
		}
        if (dp[cap][idx] != -1) {
            return dp[cap][idx];
        }
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + KnapsackTD(wt, val, cap - wt[idx], idx + 1, dp);
		}
		exc = KnapsackTD(wt, val, cap, idx + 1, dp);
		return dp[cap][idx] = Math.max(inc, exc);
	}
}




