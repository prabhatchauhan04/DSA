package Array_2D;

/* Leetcode ques 240
  Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
  Integers in each row are sorted in ascending from left to right.
  Integers in each column are sorted in ascending from top to bottom.
 */

public class Searching2dMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,4,7,11,15} , {2,5,8,12,19} , {3,6,9,16,22} , {10,13,14,17,24} , {18,21,23,26,30} };
        int target = 13;
        System.out.println(stairCaseApproach(arr , target));
    }

    public static boolean stairCaseApproach(int[][] arr , int target){
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
