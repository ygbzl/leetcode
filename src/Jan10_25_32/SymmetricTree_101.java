package Jan10_25_32;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhupd on 1/13/2017.
 */
public class SymmetricTree_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }

        boolean case1 = left.val == right.val;
        boolean case2 = helper(left.right, right.left);
        boolean case3 = helper(left.left, right.right);

        return case1 && case2 && case3;
    }

    public boolean iteration(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(left);
        q2.offer(right);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode temp1 = q1.poll();
            TreeNode temp2 = q2.poll();
            if ((temp1 == null && temp2 != null) || (temp1 != null && temp2 == null)) {
                return false;
            }
            if (temp1 != null && temp2 != null) {
                if (temp1.val != temp2.val) {
                    return false;
                }
                q1.offer(temp1.left);
                q1.offer(temp1.right);
                q2.offer(temp2.right);
                q2.offer(temp2.left);
            }
        }
        return true;
    }
}










