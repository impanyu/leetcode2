//Binary Search Tree Iterator 2.173
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    ArrayList<Integer> inOrderElements=new ArrayList<>();
    int cursor=0;
    public BSTIterator(TreeNode root) {
        inOrderPrint(root,inOrderElements);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cursor<=inOrderElements.size()-1;
    }

    /** @return the next smallest number */
    public int next() {
        int next=inOrderElements.get(cursor);
        cursor++;
        return next;
    }
    
    public void inOrderPrint(TreeNode node,ArrayList<Integer> elements){
        if(node==null)
          return;
        inOrderPrint(node.left,elements);
        inOrderElements.add(node.val);
        inOrderPrint(node.right,elements);
        
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */