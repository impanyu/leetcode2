//Remove Linked List Elements  2.203
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode pre=head;
        ListNode p=head.next;
        while(p!=null){
            if(p.val==val) pre.next=p.next;
            else pre=pre.next;
            p=p.next;
        }
        if(head.val==val) head=head.next;
        return head;
    }
}