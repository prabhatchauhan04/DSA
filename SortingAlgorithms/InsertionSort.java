package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 31, 4, 56, -3, 2, 99, -1 };

        System.out.print("Unsorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sort(arr);

        System.out.print("Sorted Array (Using Insertion Sort) : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {

       for (int i = 1; i < arr.length; i++) {
        InsertLastElement(arr, i);
       }
       
    }

    public static void InsertLastElement(int[] arr , int i){
        int item = arr[i];

        int j = i-1;

        while (j >= 0 && arr[j] > item) {
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = item;
    }
}

