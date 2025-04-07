package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 3 , 5 , 6 , 3 , 7 , 3 , 56 , 3 , 11};
        int target = 30;
        System.out.println(firstOccur(arr, target, 0));
    }
    public static int firstOccur(int[] arr , int target , int idx){
        if(arr[idx] == target){
            return idx;
        }
        if(idx == arr.length-1){
            return -1;
        }
        return firstOccur(arr , target , idx+1);
    }
}
