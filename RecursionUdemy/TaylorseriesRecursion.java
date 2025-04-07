//Taylor Series using recursion

package RecursionUdemy;

public class TaylorseriesRecursion {

    static double p = 1 , f = 1;
    public static void main(String[] args) {
        System.out.println( e(3 , 10) );
    }

    public static double e(int x , int n){
        if (n == 0) {
            return 1;
        } else {
            double res = e(x, n-1);
            p = p * x;
            f = f * n;
            return ( res + p/f );
        }
    }

}
