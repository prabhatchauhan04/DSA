package OOPS_2.Interface;

public interface Stack_Interface {
    public void push(int item);

	public int pop();

	public int peek();

	int x = 90;

    // Java 8 k baad ka 
    static void f1(){

    }
    default void f2(){

    }

    // Java 9 k baad ka
    private void f3(){

    }
}



