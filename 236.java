//236 Lowest Common Ancestor of a Binary Tree
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p) return p;
        if(root==q) return q;
        TreeNode left,right;
        left=lowestCommonAncestor(root.left,p,q);
        right=lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        else if(right==null) return left;
        else return root;
    }
}