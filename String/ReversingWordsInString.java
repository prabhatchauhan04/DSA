package String;

import java.util.Scanner;

// ques 151 Leetcode Reverse Words in a String

/* Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces. */

public class ReversingWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        s = s.trim();

        String[] arr = s.split("\s+");
        
        String ans = "";
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            ans = ans + arr[i] + " ";
        }

        return ans.trim();
    }
}
