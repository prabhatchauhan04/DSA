package Recursion_Backtracking;

/* Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally 
or vertically neighboring. The same letter cell may not be used more than once. 
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
*/

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    boolean ans = Search(board , i , j , word , 0);
                    if (ans == true) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    public static boolean Search(char[][] board , int cr , int cc , String word , int idx){
        if(idx == word.length()){
            return true;
        }
        if (cc < 0 || cr < 0 || cc > board[0].length-1 || cr > board.length-1 || word.charAt(idx) != board[cr][cc]) {
            return false;
        }
        board[cr][cc] = '*';
        int[] r = {-1 , 0 , 1 , 0};
        int[] c = {0 , -1 , 0 , 1};
        for (int k = 0; k < r.length; k++) {
            boolean ans = Search(board , cr + r[k] , cc + c[k] , word , idx+1);
            if(ans == true){
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}
