//Intersection of Two Linked Lists 2.160
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode p2=headB;
        HashSet<ListNode> s=new HashSet<>();
        //if(p==null || p2==null) return null;
        while(p!=null) {
            s.add(p); 
            p=p.next;
            
        }
        while(p2!=null) {
            if(s.contains(p2)) return p2;
            p2=p2.next;
        }
        return null;
    }
}