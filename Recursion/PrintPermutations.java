package Recursion;

// only works for strings jismein duplicate character na ho

public class PrintPermutations {
    public static void main(String[] args) {
        String ques = "abc";
        printPermutat(ques, "");
    }
    public static void printPermutat(String ques , String ans){
        if(ques.length() == 0){
            System.out.print(ans + "  ");
            return;
        }

        for (int i = 0 ; i < ques.length() ; i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0 , i);
            String s2 = ques.substring(i+1);
            printPermutat(s1 + s2 , ans + ch);
        }
    }
}