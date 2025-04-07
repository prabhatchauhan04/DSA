package Recursion_Backtracking;

// Example -->  ek array given hai coins ka say [ 2 , 3 , 5 ] toh ab humare paas infinite sikke hai 2 rs ka , 3 rs ka and 5 rs ka .
// ek sum variable given hai sum = 8 . saare permutations print krwane hai jismein sum 8 rs banjae .
// ex ->  2 2 2 2 (4 sikke le liye 2 rs k . hogya sum 8 rs). this is one of the output .

public class CoinPermutations {
    public static void main(String[] args) {
        int [] coins = {2 , 3 , 5};
        int amount = 8;
        Permutations(coins , amount , "");
    }
    public static void Permutations(int[] coins , int amount , String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                Permutations(coins , amount - coins[i] , ans + coins[i]);
            }
        }
    }
}
