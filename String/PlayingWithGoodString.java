package String;

import java.util.Scanner;

/* A Good String is a string which contains only vowels (a,e,i,o,u) . 
Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String. */

public class PlayingWithGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        sc.close();

        System.out.println(goodString(s));
    }

    public static int goodString(String s){

        int ans = 0;
        int count = 0;

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if ( isVowel(ch) == true ) {
                count++;
            } else {
                ans = Math.max(ans , count);
                count = 0;
            }
        }

        ans = Math.max(ans , count);

        return ans;

    }

    public static boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
