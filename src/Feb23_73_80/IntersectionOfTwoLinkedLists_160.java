package Feb23_73_80;

/**
 * Created by zhupd on 2/23/2017.
 */
public class IntersectionOfTwoLinkedLists_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        int i = 0, j = 0;
        while (a != null || b != null) {
            if (a != null) {
                i++;
                a = a.next;
            }
            if (b != null) {
                j++;
                b = b.next;
            }
        }
        while (i > j) {
           headA=headA.next;
            i--;
        }
        while (j > i) {
            headB = headB.next;
            j--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}