package DP;

import java.util.Arrays;

/* LeetCode Ques 931. Minimum Falling Path Sum
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or 
diagonally left/right. 
Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1). */

public class MinFailingPathSum {
    public static void main(String[] args) {
        int[][] grid = {{2,1,3},{6,5,4},{7,8,9}};
        int[][] dp = new int[grid.length][grid[0].length];
        // - 10^6 fill krdiya because grid[i][j] can be -100 to 100(Constraints). 
        // isliye ek badi negative value bhardi .
		for (int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_SumTD(grid, 0, i, dp));
		}
		System.out.println(ans);
    }
    // cr -> current row    cc -> current column
    public static int Falling_Path_SumTD(int[][] grid, int cr, int cc, int[][] dp) {
        // out of bounds
		if (cc < 0 || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
        // last row pr aagye
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int diagleft = Falling_Path_SumTD(grid, cr + 1, cc - 1, dp);
		int diagright = Falling_Path_SumTD(grid, cr + 1, cc + 1, dp);
		int down = Falling_Path_SumTD(grid, cr + 1, cc, dp);
		return dp[cr][cc] = Math.min(down, Math.min(diagright, diagleft)) + grid[cr][cc];
	}
}





