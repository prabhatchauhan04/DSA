package Stack_Queue;

public class ReverseQueue {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		
        q.Display();

        Reverse(q);

        q.Display();
    }
    private static void Reverse(Queue q) throws Exception{
        if (q.isEmpty()) {
            return;
        }
        int x = q.Dequeue();
        Reverse(q);
        q.Enqueue(x);
    }
}
