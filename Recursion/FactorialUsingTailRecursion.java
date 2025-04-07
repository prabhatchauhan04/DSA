package Recursion;

public class FactorialUsingTailRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n , 1));
    }
    public static int Fact(int n , int ans){
        if(n == 0){
            return ans;
        }
        ans = ans * n;
        return Fact(n-1, ans);
    }
}
