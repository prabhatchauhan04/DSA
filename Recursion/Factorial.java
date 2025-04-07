package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
    public static int Fact(int n){
        if (n == 0) {
            return 1;
        }
        return Fact(n-1) * n;
    }
}
