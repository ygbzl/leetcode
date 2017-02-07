package Jan14_33_40;

/**
 * Created by zhupd on 2/4/2017.
 */
public class PopulatingNextRightPointersInEachNode_116 {

    public void connect(TreeLinkNode root) {
        TreeLinkNode kid=null;
        TreeLinkNode cur = root;
        root.next = null;
        while (cur!=null) {
            if (cur.left != null) {
                kid = cur.left;
                kid.next = cur.right;
            } else {
                break;
            }
            if (cur.next != null) {
                cur.right.next = cur.next.left;
                cur = cur.next;
            } else {
                cur = cur.left;
            }

        }
    }








    public class TreeLinkNode{
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }
}


