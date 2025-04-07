package Recursion;

// ek dice k liye of 3 faces (1 , 2 , 3) . we have to print all possible combinations ki hum 0 to 'n' pr pohonc jae .

public class DiceRolling {
    public static void main(String[] args) {
        int n = 4;
        printAllWays(n , 0 , "");
    }
    public static void printAllWays(int n , int currentPos , String ans){
        if(currentPos == n){
            System.out.print(ans + " ");
            return;
        }
        if(currentPos > n){
            return;
        }
        printAllWays(n, currentPos + 1, ans + 1);
        printAllWays(n, currentPos + 2, ans + 2);
        printAllWays(n, currentPos + 3, ans + 3);
    }
}