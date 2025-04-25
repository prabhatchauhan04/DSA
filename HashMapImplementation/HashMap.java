package HashMapImplementation;

import java.util.*;

public class HashMap<K , V> {
    class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node> bukt;
    public HashMap(int n){
        bukt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bukt.add(null);
        }
    }
    public HashMap(){
        this(4); // same as HashMap(4) 
    }
}
