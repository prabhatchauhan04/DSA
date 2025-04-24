package Comparable_Comparator;

import java.util.*;

/* SPOJ Question Busy Man 
link : https://www.spoj.com/problems/BUSYMAN/ 
You are actually very busy man. You have a big schedule of activities. Your aim is to do as much as activities as possible.
In the given figure, if you go to date with crush, you cannot participate in the coding contest and you can’t watch the movie. Also if you play DotA, you can’t 
study for the exam. If you study for the exam you can’t sleep peacefully. The maximum number of activities that you can do for this schedule is 3. 
Either you can
watch movie, play DotA and sleep peacefully (or)
date with crush, play DotA and sleep peacefully
Input:
The first line consists of an integer T, the number of test cases. For each test case the first line consists of an integer N, the number of activities. 
Then the next N lines contains two integers m and n, the start and end time of each activity.
Output:
For each test case find the maximum number of activities that you can do.
Constraints:
1 ≤ T ≤10
1 ≤ N ≤ 100000
0 ≤ start < end ≤ 1000000
*/

public class BusyMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of activities
            Pair[] arr = new Pair[n];
			for (int i = 0; i < arr.length; i++) {
				int st = sc.nextInt();
				int et = sc.nextInt();
				arr[i] = new Pair(st, et);
			}
            Arrays.sort(arr , new Comparator<Pair>() {
                @Override
                public int compare(Pair o1 , Pair o2){
                    return o1.et - o2.et;
                }
            });
            int activities = 1; // no. of activities
            int end = arr[0].et;
            for (int i = 1; i < arr.length; i++) {
                if(end <= arr[i].st){
                    end = arr[i].et;
                    activities++;
                }
            }
            System.out.println("Number of maximum possible activities : " + activities);
        }
        sc.close();
    }
    static class Pair{
        int st;
        int et;
        public Pair(){

        }
        public Pair(int st , int et){
            this.st = st;
            this.et = et;
        }
    }
}



