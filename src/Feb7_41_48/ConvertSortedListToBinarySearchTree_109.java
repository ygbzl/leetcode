package Feb7_41_48;

/**
 * Created by zhupd on 2/7/2017.
 */
public class ConvertSortedListToBinarySearchTree_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return helper(head, null);
    }

    public TreeNode helper(ListNode start, ListNode end) {
        ListNode slow = start;
        ListNode fast = start;
        if (start==end) {
            return null;
        }
        while (fast != end && fast.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode node = new TreeNode(slow.val);
        node.left = helper(start, slow);
        node.right = helper(slow.next, end);
        return node;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}