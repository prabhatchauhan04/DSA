package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// Link of question :    "   https://www.spoj.com/problems/AGGRCOW/   "
// ye Unoptimized solution hai which uses linear search (Brute Force Method)

public class SPOJaggressivecowBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t > 0) {
            int n = sc.nextInt(); // number of stalls
            int c = sc.nextInt(); // number of cows

            int [] stall = new int[n];
            for(int i = 0 ; i < stall.length ; i++){
                stall[i] = sc.nextInt(); 
            }

            Arrays.sort(stall); 

            System.out.println(largest_min_dist(stall , c)); 

            t--;
        }

        sc.close();

    }

    public static int largest_min_dist(int[] stall , int c){
        int ans = 0;
        for (int i = 1; i < stall.length; i++) {
            if (isitpossible(stall, c, i) == true) {
                ans = i;
            } else {
                return ans;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] stall , int c , int mid){
        int cow = 1;
        int pos = stall[0];

        for (int i = 1 ; i < stall.length ; i++) {
            if ( (stall[i] - pos) >= mid ) {
                cow++;
                pos = stall[i];
            }
            if (cow == c) {
                return true;
            }
        }

        return false;
    }
}


