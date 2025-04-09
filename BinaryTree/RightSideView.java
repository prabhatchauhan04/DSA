package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/* LeetCode Question 199 : Binary Tree Right Side View
Given the root of a binary tree, imagine yourself standing on the right side of it, 
return the values of the nodes you can see ordered from top to bottom.
Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4] 
*/

public class RightSideView {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rightView(root , 1 , ll);
        return ll;
    }
    int maxdepth = 0;
    public void rightView(TreeNode root , int currlevel , List<Integer> ll){
        if (root == null) {
            return;
        }
        if (maxdepth < currlevel) {
            ll.add(root.val);
            maxdepth = currlevel;
        }
        rightView(root.right , currlevel + 1 , ll);
        rightView(root.left , currlevel + 1 , ll);
    }
  }
}
