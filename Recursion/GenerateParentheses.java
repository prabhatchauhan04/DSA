package Recursion;

/* Leetcode Ques 22. Generate Parentheses
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.  
    Example 1:

    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]
*/

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        generateParen(n, 0, 0, "");
    }
    public static void generateParen(int n , int open , int close , String ans){
        if(open == n && close == n){
            System.out.print(ans + " ");
            return;
        }
        if (open > n || close > open) {
            return;
        }
        generateParen(n, open + 1 , close, ans + "(");
        generateParen(n, open, close + 1 , ans + ")");
    }
}

