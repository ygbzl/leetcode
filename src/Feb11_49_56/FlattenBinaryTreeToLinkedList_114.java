package Feb11_49_56;

import AmazonOA2_Feb10.TreeNode;

/**
 * Created by zhupd on 2/12/2017.
 */
public class FlattenBinaryTreeToLinkedList_114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        if (root.left != null) {
            if (root.right != null) {
                TreeNode temp = root.right;
                root.right = root.left;

                TreeNode point = root.right;
                while (point.right != null) {
                    point = point.right;
                }
                point.right = temp;
                root.left = null;
            } else {
                root.right = root.left;
                root.left = null;
            }
        }
    }
}
