package DP;

import java.util.Arrays;

/* LeetCode Ques 746. Min Cost Climbing Stairs
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the 
cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
*/

public class MinCostClimbingStairs {
    public static void main(String[] args) {
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        int[] dp1 = new int[arr.length];
        Arrays.fill(dp1 , -1);
        int[] dp2 = new int[arr.length];
        Arrays.fill(dp2 , -1);
		int Zero_th = Climbing_StairsTD(arr, 0 , dp1);
		int first = Climbing_StairsTD(arr, 1 , dp2);
		System.out.println(Math.min(Zero_th, first));
	}
	public static int Climbing_Stairs(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int f = Climbing_Stairs(arr, i + 1);
		int s = Climbing_Stairs(arr, i + 2);
		return Math.min(f, s) + arr[i];
	}
	public static int Climbing_StairsTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
        if (dp[i] != -1) {
            return dp[i];
        }
		int f = Climbing_StairsTD(arr, i + 1, dp);
		int s = Climbing_StairsTD(arr, i + 2, dp);
		return dp[i] = (Math.min(f, s) + arr[i]);
	}
}







