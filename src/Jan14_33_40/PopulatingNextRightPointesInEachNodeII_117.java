package Jan14_33_40;

/**
 * Created by zhupd on 2/7/2017.
 */
public class PopulatingNextRightPointesInEachNodeII_117 {
    public void connect(TreeLinkNode root) {
        TreeLinkNode helper = new TreeLinkNode(0);
        TreeLinkNode pre = helper;
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next;
            if (root == null) {
                root = helper.next;
                pre = helper;
                helper.next = null;
            }
        }
    }
}
