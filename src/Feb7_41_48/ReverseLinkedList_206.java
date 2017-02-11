package Feb7_41_48;

/**
 * Created by zhupd on 2/10/2017.
 */
public class ReverseLinkedList_206 {
    //recursive
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next=newHead;
            newHead=head;
            head = temp;
        }
        return newHead;

    }
}
