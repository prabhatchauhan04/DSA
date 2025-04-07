package SlidingWindow;

// Leetcode Ques 713. Subarray Product Less Than K

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4};
        int k = 10;
        System.out.println(ProductLessThanK(arr, k));
    }

    public static int ProductLessThanK(int[] arr , int k){
        int i = 0;
        int j = 0;
        int product = 1;
        int ans = 0;

        while (j < arr.length) {
            product = product * arr[j]; // growing

            while (product >= k && i <= j) {
                product = product / arr[i];
                i++;
            } // shrinking

            ans = ans + ( j - i + 1 ); // answer

            j++;
        }

        return ans;
    }
}
