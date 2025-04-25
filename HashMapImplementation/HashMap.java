package HashMapImplementation;

import java.util.*;

public class HashMap<K , V> {
    class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node> bukt;
    int size = 0;
    public HashMap(int n){
        bukt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bukt.add(null);
        }
    }
    public HashMap(){
        this(4); // same as HashMap(4) 
    }
    public void put(K key , V value){
        int idx = Hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node nn = new Node();
        nn.value = value;
        nn.key = key;
        temp = bukt.get(idx);
        nn.next = temp;
        bukt.set(idx , nn); // update krdi value
        size++;
        // (1.0 * size) krdiya taki size double mein convert hojae
        double lf = (1.0 * size) / bukt.size(); // load factor
		double thf = 2.0; // threshold factor
		if (lf > thf) {
			rehashing();
		}
    }
    private void rehashing(){
        ArrayList<Node> a = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			a.add(null);
		}
		ArrayList<Node> old_bukt = bukt;
		bukt = a;
		size = 0; // bcoz ab size "put" method apne aap badhata rahega for new bucket 
		for (Node temp : old_bukt) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
    }
    public boolean containsKey(K key){
        int idx = Hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public V get(K key){
        int idx = Hashfun(key);
        Node temp = bukt.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    public V remove(K key) {
		int idx = Hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
        if(curr == null){
            //jo element remove krna tha woh present hi nhi hai map mein
            return null;
        }else if(prev == null){
            //remove first of linkedlist
            bukt.set(idx , curr.next);
            curr.next = null;
            size--;
            return curr.value;
        }else{
            // remove last ya beech ka element 
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.value;
        }
    }
    public int Hashfun(K key){
        int n = key.hashCode() % bukt.size();
        if (n < 0) {
            n += bukt.size();
        }
        return n;
    }
    public String toString() {
		String s = "";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + "  ";
				temp = temp.next;
			}
		}
		return s;
	}
}











