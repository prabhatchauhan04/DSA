package Array;

// Sorting Array of 0s , 1s and 2s without using sort function . 
// iska sabse optimised solution Dutch National Flag Algorithm hai .

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr = {0 , 2 , 1 , 2 , 2 , 1 , 0 , 0 , 2 , 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
