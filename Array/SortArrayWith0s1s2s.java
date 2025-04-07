package Array;

// Sorting Array of 0s , 1s and 2s without using sort function .  ye most optimised nhi hai . 
// iska sabse optimised solution Dutch National Flag Algorithm hai .

public class SortArrayWith0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0 , 2 , 1 , 2 , 2 , 1 , 0 , 0 , 2 , 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int idx = 0;
        for (int i = 0; i < count0; i++) {
            arr[idx] = 0;
            idx++;
        }
        for (int i = 0; i < count1; i++) {
            arr[idx] = 1;
            idx++;
        }
        for (int i = 0; i < count2; i++) {
            arr[idx] = 2;
            idx++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
