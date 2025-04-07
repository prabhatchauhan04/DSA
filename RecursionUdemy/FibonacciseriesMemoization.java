//Fibonacci Series using Recursion using Memoization (Advanced version with low time complexity [order of n])

package RecursionUdemy;

public class FibonacciseriesMemoization{

    static int[] F = new int[10];

    static int fib(int n){
        if (n <= 1) {
            F[n] = n;
            return F[n];
        }
        if (F[n] != -1) {
            return F[n];
        }
        F[n] = fib(n - 2) + fib(n - 1);  
        return F[n];   
    }


    public static void main(String[] args) {
        for (int i = 0; i < F.length; i++) {
            F[i] = -1; 
        }
        System.out.println(fib(7));
    }

}