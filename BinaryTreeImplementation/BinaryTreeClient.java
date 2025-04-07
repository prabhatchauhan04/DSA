package BinaryTreeImplementation;

// Input : 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println("Maximum value in tree is : " + bt.max());
        System.out.println("65 Exits in Tree : " + bt.find(65));
        System.out.println("30 Exits in Tree : " + bt.find(30));
        System.out.println("Height of tree is : " + bt.ht());
        System.out.println("pre order Traversal : ");
        bt.preOrder();
        System.out.println("post order Traversal : ");
        bt.postOrder();
        System.out.println("in order Traversal : ");
        bt.inOrder();
        System.out.println("level order Traversal : ");
        bt.levelOrder();
    }
}
