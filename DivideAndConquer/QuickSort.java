package DivideAndConquer;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5 , 7 , 2 , 1 , 8 , 3 , 4};

        Sort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr , int si , int ei){
        if (si >= ei) {
            return;
        }
        int idx = Partition(arr , 0 , ei);
        Sort(arr, si, idx-1);
        Sort(arr, idx+1, ei);
    }

    public static int Partition(int[] arr , int si , int ei){
        int item = arr[ei];
        int idx = si;

        for (int i = si ; i < ei ; i++) {
            if (arr[i] < item) {
                swap(arr, idx, i);
                idx++;
            }
        }

        swap(arr, ei , idx);

        return idx;
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
