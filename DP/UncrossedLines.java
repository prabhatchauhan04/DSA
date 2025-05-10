package DP;

/* LeetCode Ques 1035. Uncrossed Lines
You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given) 
on two separate horizontal lines.
We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:
nums1[i] == nums2[j], and
the line we draw does not intersect any other connecting (non-horizontal) line.
Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).
Return the maximum number of connecting lines we can draw in this way. */

public class UncrossedLines {
    public static void main(String[] args) {
		int[] arr1 = { 1, 4, 2 };
		int[] arr2 = { 1, 2, 4 };
		System.out.println(lcsBU(arr1, arr2));
	}
    // same code as LCS bs string ki jagah array leliya
	public static int lcsBU(int[] s1, int[] s2) {
		int[][] dp = new int[s1.length + 1][s2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}
}



