package Recursion_Backtracking;

import java.util.Scanner;

/* 
Rat Chases its cheese PROBLEM
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a 
position towards left, right, up or down on the grid.

Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. 
If a path exists-it is always unique. Find that path and help the rat reach its cheese.


Input format

First line contains 2 integers  N and M  denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.


Output format

Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is 
covered in the path and a 0 denotes that the cell is not covered in the path.

If a path does not exits then print "NO PATH FOUND"


Example 1

Input

5 4
OXOO
OOOX
XOXO
XOOX
XXOO

Output

1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 0
0 0 1 1


Constraints

1 <= N , M <= 10 
*/

public class RatChasesItsCheese {
    static boolean val = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0 ; j < s.length() ; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        sc.close();
        int [][] ans = new int[n][m];
        MazePath(maze, 0, 0, ans);
        if (val == false) {
            System.out.println("NO PATH FOUND");
        }
    }
    public static void MazePath(char[][] maze , int cr , int cc , int[][] ans){
        if (cc < 0 || cr < 0 || cc > maze[0].length-1 || cr > maze.length-1 || maze[cr][cc] == 'X') {
            return;
        }
        if (cc == maze[0].length-1 && cr == maze.length-1) {
            val = true;
            ans[cr][cc] = 1;
            Display(ans);
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;

        int[] r = {-1 , 0 , 1 , 0};
        int[] c = {0 , -1 , 0 , 1};
        for (int i = 0; i < r.length; i++) {
            MazePath(maze , cr + r[i] , cc + c[i] , ans);
        }
/*      MazePath(maze, cr-1, cc, ans); // UP
        MazePath(maze, cr, cc-1, ans); // LEFT
        MazePath(maze, cr+1, cc, ans); // DOWN
        MazePath(maze, cr, cc+1, ans); // RIGHT   */ 
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
