package Sep20_1_8;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 * Created by zhupd on 12/21/2016.
 */
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = l1, q = l2, curr = result;
        int temp = 0;
        while (p != null || q != null) {
            int x = (q == null) ? 0 : q.val;
            int y = (p == null) ? 0 : p.val;
            int sum = x + y + temp;
            temp = temp / 10;
            curr.val = sum % 10;
            curr.next = new ListNode();
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }
        if (temp > 0) {
            curr.next = new ListNode(temp);
        }
        return result;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode() {
    }
}




