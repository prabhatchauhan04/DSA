package BinarySearchTree;

/* LeetCode Ques 450 : Delete Node in a BST
Given a root node reference of a BST and a key, delete the node with the given key in the BST. 
Return the root node reference (possibly updated) of the BST.
Basically, the deletion can be divided into two stages:
Search for a node to remove.
If the node is found, delete the node.
*/

public class DeleteNodeInBst {
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
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			}else if(root.val > key) {
				root.left = deleteNode(root.left, key);
			}else{
				if (root.left == null) {
					return root.right;
				}else if(root.right == null){
					return root.left;
				}else{
					int min = min(root.right);
					root.val = min;
					deleteNode(root.right , min);
				}
			}
			return root;
        }
		public int min(TreeNode root){
			if (root == null) {
				return Integer.MAX_VALUE;
			}
			int l = min(root.left);
			return Math.min(l , root.val);
		}
    }
}
