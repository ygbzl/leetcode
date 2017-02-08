package Jan14_33_40;

/**
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

 Initially, all next pointers are set to NULL.
 * Created by zhupd on 2/4/2017.
 */
public class PopulatingNextRightPointersInEachNode_116 {

    public void connect(TreeLinkNode root) {
        TreeLinkNode level_statr = root;
        while (level_statr != null) {
            TreeLinkNode cur = level_statr;
            while (cur != null) {
                if (cur.left != null) {
                    cur.left.next = cur.right;
                }
                if (cur.right != null && cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            level_statr = level_statr.left;
        }
    }









}
class TreeLinkNode{
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}


