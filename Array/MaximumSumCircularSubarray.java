package Array;

/* Leetcode Ques 918. Maximum Sum Circular Subarray Question

Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. 
Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

A subarray may only include each element of the fixed buffer nums at most once. 
Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n. */

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , -7 , 4 , -8 , 9};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr){
        int linearSum = KadanesAlgo(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = arr[i] * -1;
        }

        int midPart = KadanesAlgo(arr);
        int circularSum = sum + midPart;

        if (circularSum == 0) {
            return linearSum;
        }

        return Math.max(linearSum , circularSum);
    }

    public static int KadanesAlgo(int[] arr){
        int ans = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            ans = Math.max(ans , sum);

            if (sum < 0) {
                sum = 0;
            }

        }

        return ans;
    }
}
