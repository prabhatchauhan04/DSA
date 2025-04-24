package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
  Link : https://codeskiller.codingblocks.com/problems/2698
  Minimum Sum Pair Question
Consider we have given Array of elements a1, a2, a3, a4. at every step, we merge two-element. 
let say  a1 + a2 =a12
now the remaining elements would be a12, a3, a4 and we can again merge the two-element   a3+a4=a34 .
now the remaining elements would be a12, a34 .
finally, we will add the last two elements to get an a1234. 
your task is to find the minimum sum of all the pairs getting added.
Input format:
First-line contains integer n as the size of the array. Next, n lines contain a single integer as an element of the array.
Output format:
Print minimum sum of all the pairs getting added.

Example 1:
Input:
4
1 2 3 4
Output:
19
Explanation
Example : 
 arr={1, 2, 3, 4}
1st Step : 1+2=3
now the remaining elements would be {3,3,4}.
2nd Step : 3+3=6
now the remaining elements would be {6,4}
3rd Step : 4+6=10
now the remaining elements would be {10}
here Size of Array is 1 , Stop Now 
sum of all the pairs  is 3+6+10=19
output is 19
 */

public class MinimumSumPair {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b;
			pq.add(a + b);
		}
		System.out.println(sum);

        sc.close();
	}
}



