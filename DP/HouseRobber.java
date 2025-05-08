package DP;

// import java.util.Arrays;

/* LeetCode Ques 198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it 
will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob 
tonight without alerting the police.
Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 */

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 3, 1 };
		// int[] dp = new int[arr.length];
		// Arrays.fill(dp, -1);
        // System.out.println(Robber(arr, 0));
        // System.out.println(RobberTD(arr, 0 , dp));
        // System.out.println(RobberTD2(arr, arr.length-1 , dp));
        System.out.println(RobberBU(arr));
    }
    public static int Robber(int[] arr , int i){
        if (i >= arr.length) {
            return 0;
        }
        int rob = arr[i] + Robber(arr, i+2);
        int Dont_rob = Robber(arr, i+1);
        return Math.max(rob , Dont_rob);
    }
    public static int RobberTD(int[] arr , int i , int[] dp){
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + RobberTD(arr, i+2 , dp);
        int Dont_rob = RobberTD(arr, i+1 , dp);
        return dp[i] = Math.max(rob , Dont_rob);
    }
    public static int RobberTD2(int[] arr , int i , int[] dp){
        if (i < 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + RobberTD2(arr, i-2 , dp);
        int Dont_rob = RobberTD2(arr, i-1 , dp);
        return dp[i] = Math.max(rob , Dont_rob);
    }
    public static int RobberBU(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);
        for (int i = 2 ; i < arr.length ; i++) {
            int rob = arr[i] + dp[i-2];
            int Dont_rob = dp[i-1];
            dp[i] = Math.max(rob , Dont_rob);
        }
        return dp[dp.length-1];
    }
}




