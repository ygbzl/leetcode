package Jan14_33_40;

/**
 * Created by zhupd on 1/14/2017.
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int now = 0;
        return total(root, now, sum);
    }

    public boolean total(TreeNode root, int now, int sum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null) {
            if (now + root.val == sum) {
                return true;
            } else {
                return false;
            }
        } else {
            now = now + root.val;
        }
        return total(root.right, now, sum) | total(root.left, now, sum);
    }
}
