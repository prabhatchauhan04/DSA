package BinaryTree;
/* LeetCode Ques 112 : Path Sum
Given the root of a binary tree and an integer targetSum, return true if 
the tree has a root-to-leaf path such that adding up all the values along 
the path equals targetSum.
A leaf is a node with no children. 
*/
public class PathSum {
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return targetSum - root.val == 0;
            }
            boolean left = hasPathSum(root.left , targetSum - root.val);
            boolean right = hasPathSum(root.right , targetSum - root.val);
            return left || right;
        }
    } 
}
