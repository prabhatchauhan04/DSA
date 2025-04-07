package Recursion_Backtracking;

import java.util.*;

/*  Leetcode Question 39 Combination Sum . 
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of 
candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of 
at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations 
for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
 */

public class CombinationSum {
    public static void main(String[] args) {
        int [] arr = {2 , 3 , 5};
        int amount = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combinations(arr , amount , ans , ll , 0);
        System.out.println(ans);
    }
    public static void Combinations(int[] arr , int amount , List<List<Integer>> ans , List<Integer> ll , int idx){
        if(amount == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (amount >= arr[i]) {
                ll.add(arr[i]);
                Combinations(arr , amount - arr[i] , ans , ll , i);
                ll.remove(ll.size()-1);
            }
        }
    }
}