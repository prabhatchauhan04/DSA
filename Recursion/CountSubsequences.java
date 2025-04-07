package Recursion;

// print total number of subsequences jitni bas sakti hai

public class CountSubsequences {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.println(countSubseq(ques, ""));
    }
    public static int countSubseq(String ques , String ans){
        if(ques.length() == 0){
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 = countSubseq(ques.substring(1) , ans);
        int a2 = countSubseq(ques.substring(1) , ans + ch);
        return a1 + a2;
    }
}
