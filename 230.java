
//230 Kth Smallest Element in a BST
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
        public int count;
        public int smallest;
        public Result(int count, int smallest){
            this.count=count;
            this.smallest=smallest;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
         return kthS(root,k).smallest;
    }
    
    public Result kthS(TreeNode root, int k){
        if(root==null) return new Result(0,-1);
        Result l=kthS(root.left,k);
       if( l.count==k) return new Result(k,l.smallest);
       else if(l.count==k-1) return new Result(k,root.val);
       else {
           Result r=kthS(root.right,k-1-l.count);
           if(r.count==k-1-l.count) return new Result(k,r.smallest);
           else return new Result(l.count+r.count+1,-1);
       }
    }
}