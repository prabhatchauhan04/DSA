package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 51, 40, 5, 3, 2, 4, -17 };

        System.out.print("Unsorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sort(arr);

        System.out.print("Sorted Array (Using Selection Sort) : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
        int idx = minidx(arr, i);
        //swap
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
       }
    }

    public static int minidx(int[] arr , int i){
        int mini = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
    }
}
