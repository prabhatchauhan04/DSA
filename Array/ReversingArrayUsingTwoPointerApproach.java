package Array;

public class ReversingArrayUsingTwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {3 , 5 , 1 , 7 , 8 , 6};

        System.out.print("Array before reversing it : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Reverse(arr);

        System.out.print("Array after reversing it : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int[] array){
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }
}
