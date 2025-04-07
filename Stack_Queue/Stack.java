package Stack_Queue;

// Fixed size ka stack implement krenge  (Static Stack)

public class Stack {
    protected int[] arr;
    private int idx = -1;

    public Stack(){
        arr = new int[5];
    }

    public Stack(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return idx == -1;
    }

    public void push(int item) throws Exception{
        if (isfull()) {
            throw new Exception("Bklol stack full hai ");
        }
        idx++;
        arr[idx] = item;
    }

    public int size(){
        return idx+1;
    }

    public boolean isfull(){
        return idx == arr.length-1;
    }

    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("Bklol stack Empty hai");
        }
        int rv = arr[idx];
        idx--;
        return rv;
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("Bklol stack Empty hai");
        }
        return arr[idx];
    }

    public void Display(){
        for (int i = 0 ; i <= idx ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
