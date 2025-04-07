package Stack_Queue;

/* Leetcode Ques 84 : Largest Rectangle in Histogram 
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
return the area of the largest rectangle in the histogram.
Example 1 :--
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2 :--
Input: heights = [2,4]
Output: 4
  */

import java.util.Stack;

public class LargestRectHistogram {
    public static void main(String[] args) {
        int[] heights = {2 , 1 , 5 , 6 , 2 , 3};
        calcMaxArea(heights);
    }
    public static void calcMaxArea(int[] heights){
        int area = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!(st.isEmpty()) && heights[i] < heights[st.peek()]) {
                int R = i;
                int h = heights[st.pop()];
                if (st.isEmpty()) {
                    area = Math.max(area , (R)*(h));
                } else {
                    int L = st.peek();
                    area = Math.max(area , (R-L-1)*(h));
                }
            }
            st.push(i);
        }
        while (st.isEmpty() == false) {
            int R = heights.length;
            int h = heights[st.pop()];
            if (st.isEmpty()) {
                area = Math.max(area , (R)*(h));
            } else {
                int L = st.peek();
                area = Math.max(area , (R-L-1)*(h));
            }
        }
        System.out.println("Area of Largest Rectangle in Histogram is : " + area);
    }
}
