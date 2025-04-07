//Fibonacci Series using Iterative Approach(Basic version with low time complexity [order of n])

package RecursionUdemy;

public class FibonacciseriesIterative{
    static int fib(int n){
        int t0 = 0;
        int t1 = 1;
        int s = 0;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <= n ; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

}
