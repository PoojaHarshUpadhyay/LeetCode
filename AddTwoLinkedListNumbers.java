/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            int lastDigit = sum % 10;
            carry = sum / 10;
            ListNode n = new ListNode(lastDigit);
            l3.next = n;
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;
        }
        
        while (l1 != null) {
            int sum = l1.val + carry;
            int lastDigit = sum % 10;
            carry = sum / 10;

            ListNode n = new ListNode(lastDigit);
            l3.next = n;
            l3 = l3.next;
            l1 = l1.next;
        }
        
        while(l2 != null) {
            int sum = l2.val + carry;
           int lastDigit = sum % 10;
           carry = sum /10; 

            ListNode n = new ListNode(lastDigit);
            l3.next = n;
            l3 = l3.next;
            l2 = l2.next;
        }
        
        if(carry != 0) {
            ListNode n = new ListNode(carry);
            l3.next = n;
            l3 = l3.next;
        }
        
        return dummy.next;
        
    }
}
