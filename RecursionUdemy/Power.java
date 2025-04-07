// m^n value 

package RecursionUdemy;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow1(2,8));
        System.out.println(pow2(2,8));
    }

    public static int pow1(int m , int n){
        if(n == 0){
            return 1;
        }else if(n%2 == 0){
            return pow1(m*m, n/2);
        }else{
            return (m * pow1(m*m, (n-1)/2));
        }
    }// in this function we reduced computations

    public static int pow2(int m , int n){
        if(n == 0){
            return 1;
        }else{
            return m * pow2(m, n-1);
        }
    }//its the basic version where computations are too much

}
