//Indirect Recursion

package RecursionUdemy;

public class Indirect{

    public static void main(String[] args){
        System.out.print("Output is : ");
        funcA(20);
    }

    public static void funcA(int n){
        if(n>0){
            System.out.print(n + " ");
            funcB(n-1);
        }
    }

    public static void funcB(int n){
        if(n>1) {
            System.out.print(n + " ");
            funcA(n/2);
        }
    }

}
