226.Invert Binary Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
}