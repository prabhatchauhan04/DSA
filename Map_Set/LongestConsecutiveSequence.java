package Map_Set;

import java.util.HashMap;

/* 
LeetCode Ques 128. Longest Consecutive Sequence
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:
Input: nums = [1,0,1,2]
Output: 3 
*/

public class LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashMap<Integer , Boolean> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i]-1)) {
                    map.put(nums[i], false);
                } else {
                    map.put(nums[i], true);
                }
                if (map.containsKey(nums[i]+1)) {
                    map.put(nums[i]+1, false);
                }
            }
            int ans = 0;
            for (int key : map.keySet()) {
                if(map.get(key) == true){
                    int count = 0;
                    while (map.containsKey(key)) {
                        count++;
                        key++;
                    }
                    ans = Math.max(count , ans);
                }
            }
            return ans;
        }
    }
}
