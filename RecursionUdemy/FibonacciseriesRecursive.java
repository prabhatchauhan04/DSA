//Fibonacci Series using Recursion (Basic version with very high time complexity [order of 2^n])

package RecursionUdemy;

public class FibonacciseriesRecursive {
    static int fib(int n){
        if (n <= 1) {
            return n;
        }
        return fib(n-2)+fib(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

}
