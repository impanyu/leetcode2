//Maximum Gap 2.199
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
    public List<Integer> rightSideView(TreeNode root) {
        //BFS
        List<Integer> l=new ArrayList<>();
        if(root==null) return l;
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        ArrayDeque<Integer> level=new ArrayDeque<>();
        queue.add(root);
        level.add(1);
        while(!queue.isEmpty()){
            TreeNode p=queue.pop();
            int lv=level.pop();
          if(p.left!=null) {
              queue.add(p.left);
              level.add(lv+1);
          }
          if(p.right!=null) {
              queue.add(p.right);
              level.add(lv+1);
          }
          if(level.peek()==null || level.peek()>lv)  
             l.add(p.val);
          
        }
        return l;
    }
}