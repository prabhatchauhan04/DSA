package DP;

import java.util.Arrays;

/* LeetCode ques 518. Coin Change II
You are given an integer array coins representing coins of different denominations and an integer amount 
representing a total amount of money.
Return the number of combinations that make up that amount. If that amount of money cannot be made up by any 
combination of the coins, return 0.
You may assume that you have an infinite number of each kind of coin.
The answer is guaranteed to fit into a signed 32-bit integer.
Example 1:
Input: amount = 5, coins = [1,2,5]
Output: 4
Explanation: there are four ways to make up the amount:
5=5
5=2+2+1
5=2+1+1+1
5=1+1+1+1+1 */

public class CoinChangeII {
    public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coins, amount, 0));
		System.out.println(Coin_ChangeTD(coins, amount, 0, dp));
	}
    public static int Coin_Change(int[] coin, int amount, int idx) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
        // included(inc)   excluded(exc) 
		int inc = 0, exc = 0;
		if (coin[idx] <= amount) {
			inc = Coin_Change(coin, amount - coin[idx], idx);
		}
		exc = Coin_Change(coin, amount, idx + 1);
		return inc + exc;
	}
	public static int Coin_ChangeTD(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
        // koi coin nhi bacha
		if (idx == coin.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[amount][idx];
		}
		int inc = 0, exc = 0;
		if (coin[idx] <= amount) {
			inc = Coin_ChangeTD(coin, amount - coin[idx], idx, dp);
		}
		exc = Coin_ChangeTD(coin, amount, idx + 1, dp);
		return dp[amount][idx] = inc + exc;
	}
	public static int Coin_ChangeBU(int[] coins, int amount) {
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int am = 1; am < dp.length; am++) {// amount
			for (int i = 1; i < dp[0].length; i++) {// coin
				int inc = 0, exc = 0;
				if (coins[i - 1] <= am) {
					inc = dp[am - coins[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}
}






