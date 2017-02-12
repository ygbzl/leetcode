package Feb7_41_48;

/**
 * Created by zhupd on 2/11/2017.
 */
public class ReverseLinkedListII_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0;i<m-1;i++) {
            pre = pre.next;
        }

        ListNode start = pre.next;
        ListNode then = start.next;
        for(int i=0;i<n-m;i++) {
            start.next = then.next;
            then.next=pre.next;
            pre.next=then;
            then = start.next;
        }
        return dummy.next;
    }
}
