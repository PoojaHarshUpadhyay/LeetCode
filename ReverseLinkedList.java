/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       while(head != null) {
          ListNode next_node = head.next;
          head.next = prev;
          prev = head;
          head = next_node;
       }
       return prev;
    }
}

//https://www.youtube.com/watch?v=NhapasNIKuQ
