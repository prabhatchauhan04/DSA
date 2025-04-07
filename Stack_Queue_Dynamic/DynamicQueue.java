package Stack_Queue_Dynamic;

import Stack_Queue.Queue;

public class DynamicQueue extends Queue{
    @Override
    public void Enqueue(int item) throws Exception{
        if (isfull()) {
            int [] newArr = new int[2 * arr.length]; 
            int i = 0;
            for (; i < arr.length; i++) {
                int idx = (front+i) % arr.length;
                newArr[i] = arr[idx];
            }
            arr = newArr; 
            front = 0;
        }
        super.Enqueue(item);
    }
    public static void main(String[] args) throws Exception{
        DynamicQueue q = new DynamicQueue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(50);
        q.Enqueue(60);
        q.Enqueue(70);
        q.Enqueue(80);
        q.Display();
    }
}

