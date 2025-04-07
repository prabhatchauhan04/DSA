package Recursion;

// All possible ways/paths to go from (0,0) to (m-1,n-1) in a   m x n   matrix .
// 'V' means vertical move downside and 'H' means horizontal move rightside.

public class PathsFromOneEndToAnotherInMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        printPath(0 , 0 , n-1 , m-1 , "");
    }
    public static void printPath(int currentCol , int currentRow , int endCol , int endRow , String ans){
        if (currentCol == endCol && currentRow == endRow) {
            System.out.println(ans);
            return;
        }
        if (currentCol > endCol || currentRow > endRow) {
            return;
        }
        printPath(currentCol + 1, currentRow, endCol, endRow, ans + "H");
        printPath(currentCol, currentRow + 1, endCol, endRow, ans + "V");
    }
}
