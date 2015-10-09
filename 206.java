//2.206 Reverse Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head;
        ListNode next=p.next;
        ListNode next2=next.next;
        p.next=null;
        while(true){
          next.next=p;
          if(next2==null)  break;
          p=next;
          next=next2;
          next2=next2.next;
          
        }
        return next;
    }
}