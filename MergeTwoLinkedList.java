/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //dummy node which has 0 value and points to actual l3 first node
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy; 
        
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else{
                l3.next = l2; 
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        
        if(l1 != null) {
            l3.next = l1;
        }
        
        if (l2 != null) {
            l3.next = l2;
        }
        return dummy.next;
    }
}
