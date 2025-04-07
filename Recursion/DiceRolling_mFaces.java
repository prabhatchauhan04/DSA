package Recursion;

// ek dice k liye of any number of faces (1 , 2 , 3 ,.........) . we have to print all possible combinations ki hum 0 to 'n' pr pohonc jae .

public class DiceRolling_mFaces {
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
        for(int dice = 1 ; dice <= 3 ; dice++){
            printAllWays(n, currentPos + dice, ans + dice);
        }
    }
}
