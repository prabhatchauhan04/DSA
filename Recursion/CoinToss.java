package Recursion;
 
// print all possible outcomes on tossing a coin "n" times.

public class CoinToss {
    public static void main(String[] args) {
        int n = 3;
        printOutcomes(n , "");
    }
    public static void printOutcomes(int n , String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        printOutcomes(n-1, ans + "H");
        printOutcomes(n-1, ans + "T");
    }
}
