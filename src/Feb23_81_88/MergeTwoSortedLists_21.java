package Feb23_81_88;

/**
 * Created by zhupd on 2/24/2017.
 */
public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val>l2.val)  {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
        else  {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }



/*        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = l2;
                break;
            }
            if (l2 == null) {
                head.next = l1;
                break;
            }
            if (l1.val > l2.val) {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            } else {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }
        }
        return dummy.next;*/
    }
}
