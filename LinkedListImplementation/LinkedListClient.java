package LinkedListImplementation;

public class LinkedListClient {
    public static void main(String[] args) throws Exception{
        LinkedList ll = new LinkedList();
 		ll.AddFirst(10);
 		ll.AddFirst(20);
 		ll.AddFirst(30);
		ll.Display();
 		ll.AddLast(40);
		ll.Display();
 		ll.AddAtIndex(-20, 2);
 		ll.Display();
		ll.AddLast(42);
 		ll.AddLast(67);
 		ll.AddLast(90);
 		ll.Display();
 		System.out.println(ll.getFirst());
 		System.out.println(ll.getLast());
 		System.out.println(ll.getIndex(2));
 		System.out.println(ll.removeFirst());
 		ll.Display();
 		System.out.println(ll.removeLast());
 		ll.Display();
 		System.out.println(ll.removeIndex(2));
 		ll.Display();
    }
}
