package DP;

import java.util.Arrays;

/* LeetCode Ques 115. Distinct Subsequences
Given two strings s and t, return the number of distinct subsequences of s which equals t.
The test cases are generated so that the answer fits on a 32-bit signed integer.
Example 1:
Input: s = "rabbbit", t = "rabbit"
Output: 3
*/

// Same question as coin change but with fixed supply of coins(String s characters)
public class DistinctSubsequences {
    public static void main(String[] args) {
        String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length() + 1][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_ChangeTD(s, t, 0, 0, dp));
    }    
    // i-->s string --> behaves as coin
    // j-->t string --> behaves as amount
    public static int Coin_ChangeTD(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {// amount -->0
			return 1;
		}
		if (i == s.length()) {// coin empty
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Coin_ChangeTD(s, t, i + 1, j + 1, dp);
		}
		exc = Coin_ChangeTD(s, t, i + 1, j, dp);
		return dp[i][j] = inc + exc;
	}
}


