package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 51, 40, 36, 12, 2, 4, 17 };

        System.out.print("Unsorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sort(arr);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {

        for (int turn = 1; turn < arr.length; turn++) {

            for (int i = 0; i < arr.length - turn; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }

        }

    }
}
