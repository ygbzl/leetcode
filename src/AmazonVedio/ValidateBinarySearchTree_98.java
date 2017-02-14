package Feb11_49_56;

import AmazonOA2_Feb10.TreeNode;

/**
 * Created by zhupd on 2/12/2017.
 */
public class ValidateBinarySearchTree_98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.right == null || root.left == null) {
            return false;
        }
        boolean case1 = root.left.val < root.val && root.right.val > root.val;

    }
}
