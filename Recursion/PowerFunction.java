package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(powerFunc(a, b));
    }
    public static int powerFunc(int a , int b){
        if(b == 0){
            return 1;
        }
        return powerFunc(a, b-1) * a;
    }
}
