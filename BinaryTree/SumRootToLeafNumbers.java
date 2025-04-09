package BinaryTree;

/* LeetCode Ques 129. Sum Root to Leaf Numbers 

You are given the root of a binary tree containing digits from 0 to 9 only.
Each root-to-leaf path in the tree represents a number.
For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. 
Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children. 
*/

public class SumRootToLeafNumbers {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    class Solution {
        public int sumNumbers(TreeNode root) {
            return Numbers(root, 0);
        }
        public int Numbers(TreeNode root , int sum){
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return sum * 10 + root.val; 
            }
            int leftSum = Numbers(root.left , sum * 10 + root.val);
            int rightSum = Numbers(root.right , sum * 10 + root.val);
            return leftSum + rightSum;
        }
    }
}
