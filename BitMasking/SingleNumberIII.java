package BitMasking;

import java.util.Arrays;

/* LeetCode Ques 260. Single Number III
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:
Input: nums = [-1,0]
Output: [-1,0] */

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(Single_Number(arr)));
    }
    public static int[] Single_Number(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		return new int[] { a, b };
	}
}





