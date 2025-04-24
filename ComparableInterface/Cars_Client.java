package ComparableInterface;

public class Cars_Client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
        Sort(arr);
        Display(arr);
    }

    public static void Display(Cars[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // Bubble Sort hi use krrhe
    public static <T extends Comparable<T>> void Sort(T[] arr){ 
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
