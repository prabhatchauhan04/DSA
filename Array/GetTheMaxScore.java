package Array;

/* Leetcode Ques 1537. Get the Maximum Score

  You are given two sorted arrays of distinct integers nums1 and nums2.

A valid path is defined as follows :----
  Choose array nums1 or nums2 to traverse (from index-0).
  Traverse the current array from left to right.
  If you are reading any value that is present in nums1 and nums2 you are allowed to change your path to the other array. 
   (Only one repeated value is considered in the valid path).
  The score is defined as the sum of unique values in a valid path.

Return the maximum score you can obtain of all possible valid paths.

*/

public class GetTheMaxScore {
    public static void main(String[] args) {
        int[] arr1 = {2 , 4 , 5 , 8 , 10};
        int[] arr2 = {4 , 6 , 8 , 9};
        System.out.println(maxScore(arr1, arr2));
    }

    public static int maxScore(int[] arr1, int[] arr2) {
        int i = 0; // arr1 isse traverse krenge
        int s1 = 0; // start point for arr1
        int j = 0; // arr2 isse traverse krenge
        int s2 = 0; // start point for arr2
        int ans = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                int sum1 = 0;
                for (int k = s1; k <= i; k++) {
                    sum1 += arr1[k];
                }

                int sum2 = 0;
                for (int k = s2; k <= j; k++) {
                    sum2 += arr2[k];
                }

                ans = ans + Math.max(sum1, sum2);

                i++;
                j++;
                s1 = i;
                s2 = j;
            }
        }

        int sum1 = 0;
        for (int k = s1; k < arr1.length; k++) {
            sum1 += arr1[k];
        }

        int sum2 = 0;
        for (int k = s2; k < arr2.length; k++) {
            sum2 += arr2[k];
        }

        ans = ans + Math.max(sum1, sum2);

        return ans;
    }
}
