package OOPS_2.GenericClassesMethods;

public class GenericLinkedList <T>{

// Implementing Linked List 
    class Node{
        T data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void AddFirst(T item){
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void AddLast(T item){
        if(size == 0){
            AddFirst(item);
        } else {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void AddAtIndex(T item , int k) throws Exception{
        if(k == 0){
            AddFirst(item);
        }else if(k == size){
            AddLast(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            Node K_1th = GetNode(k-1);
            nn.next = K_1th.next;
            K_1th.next = nn;
            size++;
        }
    }

    public T getFirst(){
        return head.data;
    }

    public T getLast(){
        return tail.data;
    }

    public T getIndex(int k) throws Exception{
        return GetNode(k).data;
    }

    public T removeFirst(){
        T rv = head.data;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
    }

    public T removeLast() throws Exception{
        if(size == 1){
            return removeFirst();
        }else{
            T rv = tail.data;
            Node sl = GetNode(size-2); // Last 2nd node (tail se ek pehle)
            sl.next = null;
            tail = sl;
            size--;
            return rv;
        }
    }

    public T removeIndex(int k) throws Exception{
        if(size == 1){
            return removeFirst();
        }else{
            Node k_1th = GetNode(k-1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return kth.data;
        }
    }

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.print(".");
        System.out.println();
    }

    private Node GetNode(int k) throws Exception{
        if(k < 0 || k >= size){
            throw new Exception("Bklol index range me dedo");
        }
        Node temp = head;
        for(int i = 0 ; i < k ; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int size(){
        return size;
    }

        public static void main(String[] args) {
            GenericLinkedList<String> ll = new GenericLinkedList<>();
            ll.AddLast("Kaju");
            ll.AddLast("Ankit");
            ll.AddLast("Ankita");
            ll.AddLast("Vishal");
            ll.AddLast("Pooja");
            ll.AddLast("Anku");
            ll.AddLast("Puneet");
            ll.AddLast("Amisha");
            ll.Display();
        }
}




