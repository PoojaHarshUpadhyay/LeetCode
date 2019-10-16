/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
                if (head == null || head.next == null) {
            return true;
        } else {
            StringBuilder string1 = new StringBuilder();
            StringBuilder string2 = new StringBuilder();
            ListNode n1 = head;
            while (n1.next != null) {
                string1.append(n1.val);
                n1 = n1.next;
            }
            string1.append(n1.val);

            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode n2 = prev;
            while (n2.next != null) {
                string2.append(n2.val);
                n2 = n2.next;
            }
            string2.append(n2.val);

            if (string1.toString().equals(string2.toString())) {
                return true;
            }
        }
        return false;
    }
}
