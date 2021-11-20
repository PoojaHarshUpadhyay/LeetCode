/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null) {
           return head;
       }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy; 
        
        while(curr != null && curr.next != null && curr.next.next != null) {
            ListNode fn = curr.next; 
            ListNode sn = curr.next.next;
            
            
            fn.next = sn.next;
            curr.next = sn;
            curr.next.next = fn;
            curr = curr.next.next;
        }
        
        return dummy.next;
        
    }
}
