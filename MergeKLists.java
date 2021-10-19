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
        if(lists == null || lists.length == 0 ) {
            return null;
        }  
        return mergeList(lists, 0, lists.length - 1);
    }
    
    private ListNode mergeList(ListNode[] lst, int start, int end) {
        if(start == end) {
            return lst[start];
        }
                  
        int mid = (start + end) / 2;
        ListNode left = mergeList(lst, start, mid);
        ListNode right = mergeList(lst, mid+1, end);
        return merge(left, right);
       
    }
    
    private ListNode merge(ListNode left, ListNode right ) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(left != null || right != null) {
           if(left == null) {
               curr.next = right;
               right = right.next;
           }
            else if(right == null) {
                curr.next = left;
                left = left.next;
            }
              else if(left.val < right.val) {
                    curr.next = left;
                    left = left.next;
                } else {
                    curr.next = right;
                    right = right.next;
                }
            
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
