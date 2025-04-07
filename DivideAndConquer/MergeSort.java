package DivideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5 , 7 , 1 , 4 , 3};

        int[] ans = sort(arr , 0 , arr.length-1);

        System.out.println("Unsorted Array : ");
        printArray(arr);

        System.out.println("Sorted Array : ");
        printArray(ans);
    }

    public static int[] sort(int[] arr , int si , int ei){
        if (si == ei) {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si+ei)/2;
        int[] fa = sort(arr, si, mid);
        int[] sa = sort(arr, mid+1, ei);
        return mergeArray(fa, sa);
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
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
