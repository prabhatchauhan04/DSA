//tail recursion

package RecursionUdemy;

public class Tail{

    static void tailFunc(int n){
        if (n>0) {
            System.out.print(n + " ");
            tailFunc(n-1);
        }
    }

    public static void main(String[] args){
        int x = 3;
        tailFunc(x);
    }
}