//Tree Recursion 

package RecursionUdemy;

public class Tree{
    public static void main(String[] args){
        System.out.print("Output is : ");
        fun(3);
    }

    public static void fun(int n){
        if (n>0) {
            System.out.print(n + " ");
            fun(n-1);
            fun(n-1);
        }
    }

}