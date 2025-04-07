package Array;

// Merging two sorted array to form another sorted array.

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1 , 3 , 4 , 100 , 299};
        int[] arr2 = {9 , 11 , 13 , 15 , 16 , 17 , 21 , 27};

        int[] ans = mergeArray(arr1, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] mergeArray(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int i = 0 , j = 0 , k = 0;
        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                j++;
                k++;
            } else {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
