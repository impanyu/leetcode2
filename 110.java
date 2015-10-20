//110.Balanced Binary Tree
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
    public class Result{
        public int depth;
        public boolean bal;
        public Result(int depth,boolean bal){
            this.depth=depth;
            this.bal=bal;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return isB(root).bal;
    }
    public Result isB(TreeNode root){
         if(root==null) {
             return new Result(0,true);
         }
        Result left=isB(root.left);
        Result right=isB(root.right);
        return new Result(left.depth>right.depth?left.depth+1:right.depth+1, left.bal && right.bal && Math.abs(left.depth-right.depth)<=1);
    }
}