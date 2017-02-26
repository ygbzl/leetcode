package Feb23_73_80;

import java.util.Stack;

/**
 * Created by zhupd on 2/23/2017.
 */
public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur=head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        cur=head;
        while (cur != null) {
            if(cur.val!=stack.pop().val) return false;
            cur=cur.next;
        }
        return true;
    }
}
