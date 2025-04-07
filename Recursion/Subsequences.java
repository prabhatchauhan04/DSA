package Recursion;

public class Subsequences {
    public static void main(String[] args) {
        String ques = "abc";
        printSubseq(ques, "");
    }
    public static void printSubseq(String ques , String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        printSubseq(ques.substring(1) , ans);
        printSubseq(ques.substring(1) , ans + ch);
    }
}
