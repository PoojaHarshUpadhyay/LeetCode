/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
          return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        boolean res = false;
        
        while(fast != null && fast.next != null && slow != null) {
          if(fast == slow) {
            res = true;
            break;
          }
          fast = fast.next.next;
          slow = slow.next;
        }
        return res;
    }
}
