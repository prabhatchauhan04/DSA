package Stack_Queue;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

        System.out.println(st);

        Reverse(st);

        System.out.println(st);
    }
    public static void Reverse(Stack<Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int x = st.pop();
        Reverse(st);
        InsertAtBottom(st , x);
        
    }
    public static void InsertAtBottom(Stack<Integer> st , int item){
        if (st.isEmpty()) {
            st.push(item);
            return;
        }

        int x = st.pop();
        InsertAtBottom(st, item);
        st.push(x);
    }
}