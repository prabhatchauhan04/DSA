package ComparatorInterface;

import java.util.*;

public class Cars_Client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
        Arrays.sort(arr , new Comparator<Cars>() {
            @Override
            public int compare(Cars o1 , Cars o2){
                return o1.price-o2.price;
            }
        });
        Display(arr);
        System.out.println();
        Arrays.sort(arr , new Comparator<Cars>() {
            @Override
            public int compare(Cars o1 , Cars o2){
                return o2.speed-o1.speed;
            }
        });
        Display(arr);
    }
    public static void Display(Cars[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}






