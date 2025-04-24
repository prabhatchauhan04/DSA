package HeapImplementation;

// Min Heap Implement kr rhe hai

import java.util.*;

public class Heap {
    private ArrayList<Integer> ll = new ArrayList<>();
    public void Add(int item){
        ll.add(item);
        // jo element add kra use up heapify krdenge taki maintained rhe heap
        upheapify(ll.size()-1); 
    }
    private void upheapify(int ci){
        int pi = (ci - 1) / 2; // pi : parent index  and ci : child index
        if(ll.get(pi) > ll.get(ci)){
            Swap(pi , ci);
            upheapify(pi); // ab child jha pr gya hai uss index k liye upheapify call krdiya 
            // Recursive Approach
        }
    }
    private void Swap(int pi, int ci) {
        int piValue = ll.get(pi);
        int ciValue = ll.get(ci);
        ll.set(pi , ciValue);
        ll.set(ci , piValue);
    }
    public int remove() {
        Swap(0, ll.size() - 1);
        int rv = ll.remove(ll.size() - 1);
        downheapify(0);
        return rv;

    }
    private void downheapify(int pi) {
        int lci = 2 * pi + 1; // left child index
        int rci = 2 * pi + 2; // right child index
        int mini = pi; // minimum value element ka index out of pi , lci , rci . 
        // Abhi k liye hum pi(parent index) ko minimum value wala maan rhe
        if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
            mini = lci;
        }
        if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
            mini = rci;
        }
        if (mini != pi) {
            Swap(pi, mini);
            downheapify(mini);
        }
    }
    public int get() {
        return ll.get(0);
    }
    public int size() {
        return ll.size();
    }
    public void Display() {
        System.out.println(ll);
    }
}





