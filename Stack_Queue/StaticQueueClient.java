package Stack_Queue;

// size of queue will be fixed after its creation . 

public class StaticQueueClient {
    public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();

		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
        q.Display();

		q.Enqueue(50);
		q.Enqueue(60);

		q.Display();
	}
}
