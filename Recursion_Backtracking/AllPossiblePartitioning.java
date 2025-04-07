package Recursion_Backtracking;

// Ek string ko jitne possible ways mein divide kr sake woh saare likhne hai . 
// Example --> String s = "aab"
// Then all possible partitions are : a|a|b| , a|ab| , aa|b| , aab|  
// Here ' | ' represents ki waha ek cut hai mtlb waha par partition hai .

public class AllPossiblePartitioning {
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
            Partitions(ques.substring(i) , ans + s + "|");
        }
    }
}
