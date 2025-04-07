package String;

// Axis-Orbit Solution

/* Leetcode Ques 647. Palindromic Substrings 

Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string. */

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(countPalindromic(s));
    }
    public static int countPalindromic(String s){
        int odd = 0;
        for (int axis = 0 ; axis < s.length() ; axis++) {
            for (int orbit = 0 ; (axis - orbit) >= 0 && (axis + orbit) < s.length() ; orbit++) {
                if (s.charAt(axis + orbit) != s.charAt(axis-orbit)) {
                    break;
                }
                odd++;
            }
        }
        int even = 0;
        for (double axis = 0.5 ; axis < s.length() ; axis++) {
            for (double orbit = 0.5 ; (axis - orbit) >= 0 && (axis + orbit) < s.length() ; orbit++) {
                if (s.charAt((int) (axis + orbit)) != s.charAt((int) (axis-orbit))) {
                    break;
                }
                even++;
            }
        }
        return (odd + even);
    }
}
