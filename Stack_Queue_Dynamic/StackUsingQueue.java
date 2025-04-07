package Stack_Queue_Dynamic;

public class StackUsingQueue {
    private DynamicQueue Q;

    public StackUsingQueue(){
        Q = new DynamicQueue();
    }

    public int size(){
        return Q.size();
    }

    public boolean isEmpty(){
        return Q.isEmpty();
    }

    public void push(int item) throws Exception{
        Q.Enqueue(item);
    }

    public int pop() throws Exception{
        DynamicQueue newQ = new DynamicQueue();
        while (Q.size() > 1) {
            newQ.Enqueue(Q.Dequeue());
        }
        int rv = Q.Dequeue();
        while (newQ.isEmpty() == false) {
            Q.Enqueue(newQ.Dequeue());
        }
        return rv;
    }

    public int peek() throws Exception{
        DynamicQueue newQ = new DynamicQueue();
        while (Q.size() > 1) {
            newQ.Enqueue(Q.Dequeue());
        }
        int rv = Q.Dequeue();
        Q.Enqueue(rv);
        while (newQ.isEmpty() == false) {
            Q.Enqueue(newQ.Dequeue());
        }
        return rv;
    }
    public static void main(String[] args) throws Exception {
		StackUsingQueue st = new StackUsingQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}

