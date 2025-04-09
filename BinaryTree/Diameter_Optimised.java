package BinaryTree;

/* LeetCode Ques 543 : Diameter of a Binary Tree
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.
*/

// O(n) time complexity
// Optimized Solution

public class Diameter_Optimised {
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
            return diameter(root).dia;
        }
        public DiaPair diameter(TreeNode root){
            if (root == null) {
                return new DiaPair();
            }
            DiaPair ldp = diameter(root.left);
            DiaPair rdp = diameter(root.right);
            DiaPair sdp = new DiaPair();
            sdp.ht = Math.max(ldp.ht , rdp.ht) + 1;
            int sd = ldp.ht + rdp.ht + 2;
            sdp.dia = Math.max(sd , Math.max(rdp.dia , ldp.dia));
            return sdp;
        }
        class DiaPair{
            int dia = 0;
            int ht = -1;
        }
    }  
}


