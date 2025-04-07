package Recursion_Backtracking;

// Putting "tq" total number of queens in "n" number of boxes. There are n number of boxes arranged linearly . we have to put all 
// queens in these boxes and a box can have one queen at max . ek dibbe mein ek se jyada rani nhi baith sakti . dibbe jyada hai raniyo se . 
// ye permutations ka question hai . Arrangement matters . 
// say queen_1 in box_1 & queen_2 in box_2 AND queen_2 in box_1 & queen_1 in box_2 are two different arrangements . 
// ye saare permutations print krwane hai .

public class QueenPermutations {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        permutation(board, tq, "", 0);
    }

    // int " qspf " is Number of "Queens Placed So Far" . 

    public static void permutation(boolean[] board , int tq , String ans , int qpsf){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                permutation(board, tq, ans + "b" + i + "q" + qpsf , qpsf + 1);
                board[i] = false;
            }
        }
    }
}
