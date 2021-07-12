/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return mergeSort(lists, 0, lists.length-1);
    }
    private ListNode mergeSort(ListNode[] lists, int start, int end) {
        if(start == end) {
            return lists[start];
        }
        int mid = (start + end )/ 2;
        ListNode left = mergeSort(lists, start, mid);
        ListNode right = mergeSort(lists, mid+1, end);
        return merge(left, right);
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while (l1 != null || l2 != null) {
                if(l1 == null) {
                    curr.next = l2;
                    l2 = l2.next;
                } else if(l2 == null) {
                    curr.next = l1;
                    l1 = l1.next;
                } else if(l1.val < l2.val) {
                    curr.next = l1;
                    l1 = l1.next;
                } else {
                    curr.next = l2;
                    l2 = l2.next;
                }
            
            curr = curr.next;
        }
        return result.next;
    }
}
