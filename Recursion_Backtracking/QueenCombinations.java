package Recursion_Backtracking;

// Putting "tq" total number of queens in "n" number of boxes. There are n number of boxes arranged linearly . we have to put all 
// queens in these boxes and a box can have one queen at max . ek dibbe mein ek se jyada rani nhi baith sakti . dibbe jyada hai raniyo se . 
// ye combinations ka question hai . Arrangement doesNOT matter . 
// say queen_1 in box_1 & queen_2 in box_2 AND queen_2 in box_1 & queen_1 in box_2 are same arrangements . 
// ye saare combinations print krwane hai .

public class QueenCombinations {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        Combinations(board, tq, "", 0, 0);
    }

    // int " qspf " is Number of "Queens Placed So Far" . 
    // int "idx" is index jaha last baar baithaya tha . toh uske ek index aage se chale next frame mein .

    public static void Combinations(boolean[] board , int tq , String ans , int qpsf , int idx){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Combinations(board, tq, ans + "b" + i + "q" + qpsf , qpsf + 1 , i + 1);
                board[i] = false;
            }
        }
    }
}
