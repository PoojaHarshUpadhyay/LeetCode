import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.traverse();
    }

    ListNode head;

    void insert(int val) {
      ListNode node = new ListNode(val);
      if(head == null) {
          head = node;
      } else {
          ListNode n = head;
          while (n.next != null) {
              n = n.next;
          }
          n.next = node;
      }
    }

    void traverse() {
        ListNode n = head;
        while (n.next != null) {
            System.out.println(n.val);
            n = n.next;
        }
        System.out.println(n.val);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


}
