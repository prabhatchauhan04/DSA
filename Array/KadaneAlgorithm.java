package Array;
//Leetcode question 53
//Ye optimised solution hai MaximumSubarray Question ka
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1 , -3 , 18 , -24 , 66 , 17 , -3};

        System.out.println(MaxSum(arr));
    }

    public static int MaxSum(int[] arr){
        int ans = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            ans = Math.max(ans , sum);

            if (sum < 0) {
                sum = 0;
            }

        }

        return ans;
    }
}


