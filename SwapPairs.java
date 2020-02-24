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
         if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevNode = dummy;
        while (head != null && head.next != null ) {
            ListNode first = head;
            ListNode second = head.next;
            ListNode third = head.next.next;

            prevNode.next = second;
            second.next = first;
            first.next = third;
            prevNode = first;
            head = head.next;
        }

        return dummy.next;
    }
}
