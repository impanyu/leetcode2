//2.234 Palindrome Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        if(head==null) return true;
        int len=0;
        int i=0;
        ListNode p=head;
        while(p!=null){
            len++;
            p=p.next;
        }
        p=head;
       while(p!=null){
            if(i<len/2) stack.push(p.val);
            else if(i==len/2 && len%2!=0); 
            else if(stack.pop().intValue()!=p.val) return false;
            p=p.next;
            i++;
        }
      return stack.isEmpty();
    }
}