package Inheritance;

public class Client {
    public static void main(String[] args) {
        // // Case 1 
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // obj.fun();
        // obj.fun2();

        // // Case 2
        // P obj = new C();
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // System.out.println( ((C)(obj)).d1 );
        // System.out.println( ((C)(obj)).d );
        // obj.fun();
        // obj.fun2();
        // ((C)(obj)).fun1();
    
        // // Case 3
        // C obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // System.out.println(obj.d1);

        // Case 4 
        C obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        System.out.println( ((P)(obj)).d );
        obj.fun();
        ((P)(obj)).fun();
        obj.fun1();
        obj.fun2();
    }
}
