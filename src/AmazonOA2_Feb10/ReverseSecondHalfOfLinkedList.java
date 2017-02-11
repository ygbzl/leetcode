package AmazonOA2_Feb10;

/**
 * Created by peidong on 2/11/17.
 */
public class ReverseSecondHalfOfLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        if (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        head = slow;
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead.next = head;
            head = temp;
        }
        return newHead;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
