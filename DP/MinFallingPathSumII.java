package DP;

import java.util.Arrays;

/* LeetCode Ques 1289. Minimum Falling Path Sum II
Given an n x n integer matrix grid, return the minimum sum of a falling path with non-zero shifts.
A falling path with non-zero shifts is a choice of exactly one element from each row of grid such that 
no two elements chosen in adjacent rows are in the same column. */

public class MinFallingPathSumII {
    public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_SumTD(grid, 0, i, dp));
		}
		System.out.println(ans);
	}
    public static int Falling_Path_SumTD(int[][] grid , int cr , int cc , int[][] dp){
        // jab last row pr pohonch jae
        if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			if (cc != i) {
				ans = Math.min(ans, Falling_Path_SumTD(grid, cr + 1, i, dp));
			}
		}
		return dp[cr][cc] = ans + grid[cr][cc];
    }
}



