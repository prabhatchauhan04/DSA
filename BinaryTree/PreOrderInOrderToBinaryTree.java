package BinaryTree;

/* LeetCode Ques 105 : Construct Binary Tree from Preorder and Inorder Traversal
Given two integer arrays preorder and inorder where preorder is the 
preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, 
construct and return the binary tree. */

public class PreOrderInOrderToBinaryTree {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return Create(preorder , 0 , preorder.length-1 , inorder , 0 , inorder.length-1);
        }
        public TreeNode Create(int[] pre , int plo , int phi , int[] in , int ilo , int ihi){
            if (plo > phi || ilo > ihi) {
                return null;
            }
            TreeNode node = new TreeNode(pre[plo]);
            int idx = Search(in, ilo, ihi, pre[plo]);
            int ne = idx - ilo; // number of leftChildElements
            node.left = Create(pre, plo + 1, plo + ne , in, ilo, idx-1);
            node.right = Create(pre, plo + ne + 1 , phi, in, idx+1, ihi);
            return node;
        }
        public int Search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}
    }
}
