package DP;

import java.util.Arrays;

/* https://codeskiller.codingblocks.com/problems/281
Valentine Magic Question
It's Valentine's Day in Russia today. as we all know number of girls in Russia is more than number of boys 😜 
hence boys have an extra advantage while choosing girl for the valentine evening. Each boy has certain number 
of chocolates and each girl has certain number of candies. Now you being the anchor of evening wants to pair all 
the boys with girls such that the sum of absolute difference between boy's chocolate and girl's candy in a pair is minimized. 
Ofcourse some of the girls will remain unpaired but that's okay as we are in Russia 😜 */

public class Valentine_Magic {
    public static void main(String[] args) {
        int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };   
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(ValentineMagic(boys, girls, 0, 0));
    }
    // i -> boys      j -> girls
    public static int ValentineMagic(int[] boys , int[] girls , int i , int j){
        // har ladke ka pair bngya
        if (i == boys.length) {
            return 0;
        }
        // saari ldkiya reject hogyi
        if (j == girls.length) {
            return 1000000; // taki number overflow na kre 
            // agar Integer.MAX_VALUE mein hum baki absolute diff add krte toh woh overflow krjata
        }
        int pair = Math.abs(boys[i] - girls[j]) + ValentineMagic(boys, girls, i + 1, j + 1);
		int no_pair = ValentineMagic(boys, girls, i, j + 1);
		return Math.min(pair, no_pair);
    }
}



