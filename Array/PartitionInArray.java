package Array; 

//  Last index k element ko uski uss position pr rakhna h jaha pr woh agar ye array sorted hota toh woh element waha hota . 
//  woh index return bhi krdenge jaha sorted array mein woh element hota . 

public class PartitionInArray {
    public static void main(String[] args) {
        int[] arr = {5 , 7 , 2 , 1 , 8 , 3 , 4};
        int idx = Partition(arr , 0 , arr.length-1);

        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Index : " + idx);
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