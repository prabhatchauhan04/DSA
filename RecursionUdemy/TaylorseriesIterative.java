// Taylor Series using Horner's Rule (Iterative Function)

package RecursionUdemy;

public class TaylorseriesIterative {

    static double e(double x , double n){
        double s = 1;
        for (double n1 = n ; n1 > 0 ; n1--) {
            s = 1 + x/n1 * s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(e(3, 10));
    }

}
