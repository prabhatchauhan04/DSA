// Finding nCr using Factorial method(Factorial method uses recursion)

package RecursionUdemy;

public class CombinationsFactorial {
    static int Fact(int a){
        if (a == 0) {
            return 1;
        }
        return a*Fact(a-1);
    }

    static int nCr(int n , int r){
        return (Fact(n)) / (Fact(r)*Fact(n-r));
    }

    public static void main(String[] args) {
        System.out.println(nCr(4, 3));
    }
}
