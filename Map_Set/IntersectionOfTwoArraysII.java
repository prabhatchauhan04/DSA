package Map_Set;

import java.util.*;

/* LeetCode ques 350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted. */

public class IntersectionOfTwoArraysII {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer , Integer> map = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])) {
                    map.put(nums1[i], map.get(nums1[i]) + 1);
                } else {
                    map.put(nums1[i], 1);
                }
            }
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < nums2.length; i++) {
                if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                    ll.add(nums2[i]);
                    map.put(nums2[i] , map.get(nums2[i]) - 1);
                }
            }
            int[] arr = new int[ll.size()];
            for (int i = 0 ; i < arr.length ; i++) {
                arr[i] = ll.get(i);
            }
            return arr;
        }
    }
}


