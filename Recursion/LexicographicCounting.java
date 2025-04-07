package Recursion;

// Given an integer n, return all the numbers in the range [0, n] sorted in lexicographical order.

public class LexicographicCounting {
    public static void main(String[] args) {
        int n = 1000;
        Counting(n , 0);
    }
    public static void Counting(int n , int currentNum){
        if(currentNum > n){
            return;
        }
        System.out.println(currentNum);
        int i = 0;
        if(currentNum == 0){
            i = 1;
        }
        for( ; i <= 9 ; i++){
            Counting(n, currentNum * 10 + i);
        }
    }
}
