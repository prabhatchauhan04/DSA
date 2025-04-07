package SlidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {2 , 1 , 4 , 2 , 6 , 2 , 7 , 4 , 8 , 3};
        int k = 3;
        System.out.println(maximumSum(arr, k));
    }
  
    public static int maximumSum(int[] arr , int k){
        int Sum = 0;
        int Ans = 0;

        for (int i = 0 ; i < k ; i++) {
            Sum += arr[i];
        }

        Ans = Sum;

        for (int i = k ; i < arr.length ; i++) {
            Sum += arr[i];
            Sum -= arr[i-k];
            Ans = Math.max(Ans , Sum);
        }

        return Ans;
    }
}
