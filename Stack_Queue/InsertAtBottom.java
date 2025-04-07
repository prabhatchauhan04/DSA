package Stack_Queue;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

        System.out.println(st);

        Insert(st , -6);

        System.out.println(st);
    }
    public static void Insert(Stack<Integer> st , int item){
        if (st.isEmpty()) {
            st.push(item);
            return;
        }

        int x = st.pop();
        Insert(st, item);
        st.push(x);
    }
}
