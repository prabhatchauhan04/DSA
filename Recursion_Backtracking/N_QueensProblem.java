package Recursion_Backtracking;

public class N_QueensProblem {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        QueensProblem(board , n , 0);    
    }
    public static void QueensProblem(boolean [][] board , int tq , int row){
        if(tq == 0){
            Display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (IsItSafe(board , row , col) == true) {
                board[row][col] = true;
                QueensProblem(board , tq-1 , row+1);
                board[row][col] = false;
            }
        }
    }
    public static void Display(boolean[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean IsItSafe(boolean[][] board , int row , int col){
        int r = row;
        while (r >= 0) {
            if(board[r][col] == true){
               return false; 
            }
            r--;
        }

        r = row;
        int c = col;
        while (r >= 0 && c>= 0) {
            if(board[r][c] == true){
               return false; 
            }
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if(board[r][c] == true){
               return false; 
            }
            r--;
            c++;
        }
        return true;
    }
}
