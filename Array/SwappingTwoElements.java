package Array;

public class SwappingTwoElements {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5};

        System.out.println("Before Swapping elements at index 0 and index 1 !");
        System.out.println("Element at index 0 is : " + arr[0] + " and at index 1 is : " + arr[1]);
        System.out.println();

        Swap(arr , 0 , 1);

        System.out.println("After Swapping elements at index 0 and index 1 !");
        System.out.println("Element at index 0 is : " + arr[0] + " and at index 1 is : " + arr[1]);
    }

    public static void Swap(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
