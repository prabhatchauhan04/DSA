package DP;

import java.util.Arrays;

/* LeetCode Ques 300. Longest Increasing Subsequence
Given an integer array nums, return the length of the longest strictly increasing subsequence.
Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1 
*/

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(LIS(nums));
    }
    public static int LIS(int[] arr){
        int[] lis = new int[arr.length];
        Arrays.fill(lis, 1);
        for (int i = 1 ; i < lis.length ; i++) {
            for (int j = i-1 ; j >= 0 ; j--) {
                if (arr[i] > arr[j]) {
                    int l = lis[j];
                    lis[i] = Math.max(lis[i] , l+1);
                }
            }
        }
        int max = lis[0];
        for (int i = 1; i < lis.length; i++) {
            max = Math.max(max , lis[i]);
        }
        return max;
    }
}
