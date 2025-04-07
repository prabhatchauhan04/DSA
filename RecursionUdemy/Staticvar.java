//Static Variables in java

package RecursionUdemy;

public class Staticvar{

    static int x = 0;
    
    public static void main(String[] args){
        int a = 5;
        Staticvar obj = new Staticvar();
        System.out.println(obj.fun(a));
    }

    public int fun(int n){
        if (n>0) {
            x++;
            return fun(n-1) + x;    
        }
        return 0;
    }

}