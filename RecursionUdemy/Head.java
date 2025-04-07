//head recursion

package RecursionUdemy;

public class Head{

    void headFunc(int n){
        if (n>0) {
            headFunc(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args){
        int x = 3;
        Head h = new Head();
        h.headFunc(x);
    }
}














