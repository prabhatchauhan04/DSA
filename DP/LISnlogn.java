package DP;

/* LeetCode ques 300. Longest Increasing Subsequence (O(nlogn) solution) => optimized solution
Given an integer array nums, return the length of the longest strictly increasing subsequence.
Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. */

public class LISnlogn {
    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LIS(arr));
    }
    public static int LIS(int[] arr) {
		int[] lis = new int[arr.length];
		lis[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > lis[len - 1]) {
				lis[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(lis, 0, len - 1, arr[i]);
				lis[idx] = arr[i];
			}
		}
		return len;
	}
	private static int BinarySearch(int[] lis, int si, int ei, int item) {
		int idx = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (lis[mid] >= item) {
				idx = mid;
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return idx;
	}
}
