package BinarySearchTree;

/* LeetCode Ques 98 : Validate Binary Search Tree
Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees. */

public class ValidBSTorNot {
    public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return validBST(root).isbst;
        }
        private BstPair validBST(TreeNode root){
            if (root == null) {
                return new BstPair();
            }
            BstPair lbp = validBST(root.left);
            BstPair rbp = validBST(root.right);
            BstPair sbp = new BstPair();
            sbp.max = Math.max(root.val , Math.max(lbp.max , rbp.max));
            sbp.min = Math.min(root.val , Math.min(lbp.min , rbp.min));
            sbp.isbst = lbp.isbst && rbp.isbst && root.val > lbp.max && root.val < rbp.min;
            return sbp;
        }
        class BstPair{
            boolean isbst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
    }
}
