package BinarySearchTree;

// Inorder Traversal of a BST is given . We have to convert it to BinarySearchTree.

public class InorderToBST {
    class Node {
		int val;
		Node left;
		Node right;

	}

	private Node root;

	public InorderToBST(int[] arr) {
		root = CreateTree(arr, 0, arr.length - 1);
	}

	private Node CreateTree(int[] arr, int si, int ei) {
		if (si > ei) {
            return null;
        }
        int mid = (si + ei)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateTree(arr, si, mid-1);
        nn.right = CreateTree(arr, mid+1, ei);
        return nn;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		InorderToBST bst = new InorderToBST(arr);
	}
}
