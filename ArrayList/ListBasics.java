package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(30);
        li.add(100);
        li.add(20);// adding element to the end of list

        for (int i : li) {
            System.out.print(i + "   ");
        }
        System.out.println();

        li.add(0 , -100 ); // Adding an element to list at index 0
        System.out.println(li);

        li.set(0, 10); // Updating value of element at index 0
        System.out.println(li);

        System.out.println("Size of list is : " + li.size());

        li.remove(0); // Deleting element at index 0
        System.out.println(li);

        Collections.sort(li); // Sorting list li in ascending order
        System.out.println("Sorted list : " + li);
    }
}