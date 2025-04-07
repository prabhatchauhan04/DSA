package BinaryTree;

/* LeetCode Ques 543 : Diameter of a Binary Tree
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
*/

public class Diameter {
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
        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int ld = diameterOfBinaryTree(root.left);
            int rd = diameterOfBinaryTree(root.right);
            int sd = ht(root.left) + ht(root.right) + 2;
            return Math.max(sd , Math.max(rd, ld));
        }
        public int ht(TreeNode nn){
        if (nn == null) {
            return -1;
        }
        int htLeft = ht(nn.left);
        int htRight = ht(nn.right);
        return Math.max(htLeft , htRight) + 1;
        }
    }    
}
