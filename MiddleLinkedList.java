/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
      ListNode temp = head;
      int counter = countLN(head);
        int i = 0; 
        while (i < counter/2 && head.next != null) {
            head = head.next;
            i++;
        }
        return head;
    }
    
    public int countLN(ListNode head) {
        int counter = 0; 
        ListNode n = head;
        while(n != null) {
            counter++;
            n = n.next;
        }
        return counter;
    }
    
}
