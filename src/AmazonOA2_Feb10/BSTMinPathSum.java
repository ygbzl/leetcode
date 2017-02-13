package AmazonOA2_Feb10;

/**
 * Created by zhupd on 2/10/2017.
 */
public class BSTMinPathSum {
    public int MinPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right == null) {
            return (MinPathSum(root.left) + root.val);
        }
        if (root.right != null && root.left == null) {
            return (MinPathSum(root.right) + root.val);
        }
        return Math.min(MinPathSum(root.right), MinPathSum(root.left)) + root.val;
    }
}

