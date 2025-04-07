package Stack_Queue_Dynamic;

import Stack_Queue.Stack;

public class DynamicStack extends Stack{
    @Override
    public void push(int item) throws Exception{
        if (isfull()) {
            int [] newArr = new int[2 * arr.length]; 
            int i = 0;
            for (; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr; 
        }
        super.push(item);
    }
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.Display();
    }
}


