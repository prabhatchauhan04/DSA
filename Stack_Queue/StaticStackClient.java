package Stack_Queue;

// ye humne jo static stack ka implementation kra tha usko use krenge ab 

public class StaticStackClient {
    public static void main(String[] args) throws Exception{
        Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s.peek());
		
        s.Display();
		
        System.out.println(s.pop());
		
        s.Display();
		
        s.push(50);
		s.Display();

		s.push(60);
		s.push(70);
    }
}
