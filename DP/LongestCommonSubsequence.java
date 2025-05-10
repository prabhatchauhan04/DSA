package DP;

import java.util.Arrays;

/* LeetCode Ques 1143. Longest Common Subsequence
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted 
without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.
Example 1:
Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
Constraints:
1 <= text1.length, text2.length <= 1000
text1 and text2 consist of only lowercase English characters. */

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int[] arr : dp) {
            Arrays.fill(arr , -1);
        }
        // System.out.println(lcs(s1 , s2 , 0 , 0));
        System.out.println(lcsTD(s1 , s2 , 0 , 0 , dp));
    }
    // i --> s1 (index i represent s1 string ko hum index i to last index tk hi mannenge)
    // example => s1 = "abcde" and i = 2 then s1 will be "cde".
    // j --> s2
    // ye wala TLE dega 
    public static int lcs(String s1 , String s2 , int i , int j){
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + lcs(s1 , s2 , i+1 , j+1);
        } else {
            int f = lcs(s1 , s2 , i+1 , j);
            int s = lcs(s1 , s2 , i , j+1);
            ans = Math.max(f , s);
        }
        return ans;
    }
    // TOP DOWN dp approach
    public static int lcsTD(String s1 , String s2 , int i , int j , int[][] dp){
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = 1 + lcsTD(s1 , s2 , i+1 , j+1 , dp);
        } else {
            int f = lcsTD(s1 , s2 , i+1 , j , dp);
            int s = lcsTD(s1 , s2 , i , j+1 , dp);
            ans = Math.max(f , s);
        }
        return dp[i][j] = ans;
    }
    // Bottom Up dp Approach
    public static int lcsBU(String s1 , String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    int f = dp[i-1][j];
                    int s = dp[i][j-1];
                    dp[i][j] = Math.max(f , s);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}





