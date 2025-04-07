// Finding nCr using Recursion

package RecursionUdemy;

public class CombinationsRecursion{
    static int C(int n , int r){
        if (r == 0 || r == n) {
            return 1;
        }
        return C(n-1 , r-1) + C(n-1 , r);
    }

    public static void main(String[] args) {
        System.out.println(C(4, 2));
    }
}
