package Map_Set;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;

/* 
LeetCode Ques 49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:
Input: strs = [""]
Output: [[""]] 
*/

public class GroupAnagramsLeetCode {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = Key(strs[i]);
            if (map.containsKey(key) == false) {
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
    public static String Key(String s){
        int[] freq = new int[26];
        for (int i = 0 ; i < s.length() ; i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i] + " ");
        }
        return sb.toString();
    }
}
