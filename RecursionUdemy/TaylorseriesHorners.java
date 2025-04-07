//Taylor Series using Horner's Rule (Recursive Function)

package RecursionUdemy;

public class TaylorseriesHorners {
    static double s = 1;

    static double e(double x , double n){
        if (n == 0) {
            return s;
        }
        s = 1 + x/n * s;
        return e(x, n-1);
    }

    public static void main(String[] args){
        System.out.println(e(3, 10));
    }

}
