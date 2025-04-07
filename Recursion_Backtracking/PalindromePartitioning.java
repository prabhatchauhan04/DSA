package Recursion_Backtracking;

/* Leetcode Ques 131 Palindrome Partitioning :

Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 */

public class PalindromePartitioning {
    public static void main(String[] args) {
        String ques = "aab";
        Partitions(ques, "");
    }
    public static void Partitions(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 1 ; i <= ques.length() ; i++){
            String s = ques.substring(0 , i);
            if (isPalindrome(s)) {
                Partitions(ques.substring(i) , ans + s + "|");
            } 
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
