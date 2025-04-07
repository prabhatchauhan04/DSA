package Stack_Queue;

/* https://codeskiller.codingblocks.com/problems/502 Ques : Stock Span
The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to 
calculate span of stock’s price for all N days. You are given an array of length N, where ith element of array denotes the 
price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day, for which 
stock's price on these days is less than or equal to that on the ith day.
Input format :
First line contains integer N denoting size of the array. 
Next line contains N space separated integers denoting the elements of the array.
Output format :
Display the array containing stock span values.
Example 1 :
Input:
5
30
35
40
38
35
Output:
1 2 3 1 1 END
Explanation:
For the given case  
for day1 stock span =1
for day2 stock span =2 (as 35>30 so both days are included in it)
for day3 stock span =3 (as 40>35  so 2+1=3)
for day4 stock span =1 (as 38<40 so only that day is included)
for day5 stock span =1 (as 35<38 so only that day is included)
hence output is 1 2 3 1 1 END
Constraints:
1 <= N <= 10^6 
*/

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {30 , 35 , 40 , 38 , 35};
        calculateSpan(arr);
    }
    public static void calculateSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while( (st.isEmpty() == false) && (arr[i] >= arr[st.peek()]) ){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

