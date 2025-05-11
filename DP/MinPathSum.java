package DP;

/* LeetCode Ques 64. Minimum Path Sum
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum 
of all numbers along its path.
Note: You can only move either down or right at any point in time.
Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum. */

import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] x : dp) {
            Arrays.fill(x , -1);
        }
        System.out.println(Path_SumTD(grid , 0 , 0 , dp));
    }
    // r -> row    c -> column
    public static int Path_Sum(int[][] arr , int r , int c){
        // Reached last cell
        if (r == arr.length-1 && c == arr[0].length-1) {
            return arr[r][c];
        }
        // grid se bahar chle gye hum
        if (r == arr.length || c == arr[0].length) {
            return Integer.MAX_VALUE; 
        }
        int right = Path_Sum(arr, r, c+1);
        int down = Path_Sum(arr, r+1, c);
        return Math.min(right , down) + arr[r][c];
    }
    public static int Path_SumTD(int[][] arr , int r , int c , int[][] dp){
        // Reached last cell
        if (r == arr.length-1 && c == arr[0].length-1) {
            return arr[r][c];
        }
        // grid se bahar chle gye hum
        if (r == arr.length || c == arr[0].length) {
            return Integer.MAX_VALUE; 
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int right = Path_SumTD(arr, r, c+1, dp);
        int down = Path_SumTD(arr, r+1, c, dp);
        return dp[r][c] = Math.min(right , down) + arr[r][c];
    }
}




