//Sum Root to Leaf Numbers  2.129
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
       return sum(root,0);
    }
    
    public int sum(TreeNode root, int val){
        if(root==null) return 0;
        int thisVal=val*10+root.val;
        int l=sum(root.left,thisVal);
        int r=sum(root.right,thisVal);
        int sum=l+r;
        return sum==0?thisVal:sum;
    }
}