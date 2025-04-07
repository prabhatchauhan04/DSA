package Stack_Queue;

/* https://codeskiller.codingblocks.com/problems/1053 
Ques : Next Greater Element
Given an array of integers, for each element in the array, find the next greater element (NGE) in the array. 
The next greater element for an element x is the first element y to the right of x in the array such that y > x. 
If no such element exists, the NGE for that element is -1.


Input format :

The first line contains an integer n, the size of the array.
The second line contains n space-separated integers A[0], A[1], ..., A[n-1].

Output format :

Output a single line containing n space-separated integers, where each integer is the next greater element for 
the corresponding element in the input array. If no greater element exists, output -1.


Example 1 :--
Input :
4
4 5 2 10
Output :
5 10 10 -1
Explanation :
For the first element 4, the next greater element is 5.
For the second element 5, the next greater element is 10.
For the third element 2, the next greater element is 10.
For the fourth element 10, there is no greater element to the right, so the output is -1.
Constraints :
1 ≤ n ≤ 10^6
1 ≤ A[i] ≤ 10^9 */

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] ques = {4 , 5 , 2 , 10};
        int[] ans = new int[ques.length];

        nextGreater(ques , ans);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static void nextGreater(int[] ques , int[] ans){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ques.length; i++) {

            while (!(st.isEmpty()) && ques[i] > ques[st.peek()]) {
                ans[st.pop()] = ques[i];
            }

            st.push(i);
        }

        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
    }
}
