package BinaryTreeImplementation;

// Implementing Binary Tree

import java.util.*;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root = CreateTree();
    }
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if (nn == null) {
            return;
        }
        String s = "<---" + nn.val + "--->";
        if (nn.left != null) {
            s = nn.left.val + s;
        }else{
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.val;
        }else{
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = max(nn.left);
        int rightMax = max(nn.right);
        return Math.max(nn.val , Math.max(leftMax , rightMax));
    }
    public boolean find(int item){
        return find(root , item);
    }
    private boolean find(Node nn , int item){
        if (nn == null) {
            return false;
        }
        if (nn.val == item) {
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }
    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if (nn == null) {
            return -1;
        }
        int htLeft = ht(nn.left);
        int htRight = ht(nn.right);
        return Math.max(htLeft , htRight) + 1;
    }
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node nn){
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        preOrder(nn.left);
        preOrder(nn.right);
    }
    public void postOrder(){
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node nn){
        if (nn == null) {
            return;
        }
        postOrder(nn.left);
        postOrder(nn.right);
        System.out.print(nn.val + " ");
    }
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node nn){
        if (nn == null) {
            return;
        }
        inOrder(nn.left);
        System.out.print(nn.val + " ");
        inOrder(nn.right);
    }
    public void levelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node rv = q.remove(); // remove first
            System.out.print(rv.val + " ");
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}
