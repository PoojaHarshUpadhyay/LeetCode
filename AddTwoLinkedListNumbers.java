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
        //when both l1 and l2 are not null 
        while(l1 != null && l2 != null) {
            int val = l1.val + l2.val  + carry;
            int lastDigit = val %10;
            carry = val /10;
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;
        }
        while(l1 != null) {
            int val = l1.val + carry;
            int lastDigit = val%10;
            carry = val /10;
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            l3 = l3.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int val = l2.val + carry;
            int lastDigit = val % 10; 
            carry = val / 10;
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            l3 = l3.next;
            l2 = l2.next;
        }
        if(carry != 0) {
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }
        return dummy.next;
    }
}
