package Stack_Queue_Dynamic;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> st;

    public QueueUsingStack(){
        st = new Stack<>();
    }
    public int size(){
        return st.size();
    }
    public boolean isEmpty(){
        return isEmpty();
    }
    public void Enqueue(int item){
        Stack<Integer> hlps = new Stack<>();
        while (st.isEmpty() == false) {
            hlps.push(st.pop());
        }
        st.push(item);
        while (hlps.isEmpty() == false) {
            st.push(hlps.pop());
        }
    }
    public int Dequeue(){
        return st.pop();
    }
    public int GetFront(){
        return st.peek();
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.Enqueue(60);
        System.out.println(q.Dequeue());
        System.out.println(q.GetFront());
    }
}
