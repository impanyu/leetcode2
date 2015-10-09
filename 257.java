//2.257 Binary Tree Paths

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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<String>();
        ArrayList<String> result=new ArrayList<>();
        if(root.left==null && root.right==null) result.add(""+root.val);
        List<String> left, right;
        if(root.left!=null)  {
            left=binaryTreePaths(root.left);
            for(String s: left)
            result.add(""+root.val+"->"+s);
        }
        if(root.right!=null) {
            right=binaryTreePaths(root.right);
            for(String s: right)
            result.add(""+root.val+"->"+s);
        }
        return result;
    }
}