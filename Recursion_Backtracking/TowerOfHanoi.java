package Recursion_Backtracking;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        TOH(n, "A" , "C" , "B");
    }
    public static void TOH(int n , String src , String hlp , String des){
        if(n == 0){
            return;
        }
        TOH(n-1 , src , des , hlp);
        System.out.println("Move Disc Number " + n + " from " + src + " to " + des);
        TOH(n-1 , hlp , src , des);
    }
}
