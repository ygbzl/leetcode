package AmazonOA2_Feb10;

/**
 * Created by peidong on 2/11/17.
 */
public class ReverseSecondHalfOfLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is the pre of reverselist;

        ListNode temp;
        head=slow.next;
        ListNode newHead=null;
        while(head!=null){
            temp=head.next;
            head.next=newHead;
            newHead=head;
            head=temp;
        }
        slow.next=newHead;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
