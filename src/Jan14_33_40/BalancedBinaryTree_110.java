package Jan14_33_40;

import sun.nio.cs.ext.MacHebrew;

/**
 * Created by zhupd on 1/14/2017.
 */
public class BalancedBinaryTree_110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.abs(left - right)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height((root.right))) + 1;
    }


    public boolean is2(TreeNode root) {
        if (root == null) {
            return true;
        }
        int res = getHeight(root);
        if (res == -1) {
            return false;
        } else {
            return true;
        }

    }

    int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        if (leftH == -1) {
            return -1;
        }
        if (rightH == -1) {
            return -1;
        }
        int diff = Math.abs(leftH - rightH);
        if (diff > 1) {
            return -1;
        } else {
            return (rightH > leftH) ? rightH + 1 : leftH + 1;
        }
    }
}
