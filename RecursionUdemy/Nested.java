//Nested Recursion 

package RecursionUdemy;

public class Nested {
    public static void main(String[] args){
        System.out.println(fun(95));
    }

    public static int fun(int n){
        if(n>100){
            return n-10;
        }else{
            return fun(fun(n+11));
        }
    }

}
