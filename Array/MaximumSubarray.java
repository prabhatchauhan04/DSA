package Array;
//Leetcode question 53
//Ye unoptimized hai code . Ye TLE dedega . 
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {1 , -3 , 18 , -24 , 66 , 17 , -3};

        System.out.println(MaxSum(arr));
    }

    public static int MaxSum(int[] arr){
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                ans = Math.max(ans , sum);
            }  

        }

        return ans;
    }
}
