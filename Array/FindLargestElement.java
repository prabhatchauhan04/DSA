package Array;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = { 3 , 9999 , 5 , 7 , 4 , 8 , 119};

        System.out.println("Largest element in array is : " + Max(arr));

    }

    public static int Max(int[] array){
        int m = Integer.MIN_VALUE; // " m " will be largest element

        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }

        return m;
    }
}
