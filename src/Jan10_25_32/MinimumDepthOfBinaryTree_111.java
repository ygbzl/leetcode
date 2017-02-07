package Jan10_25_32;

/**
 * Created by zhupd on 1/11/2017.
 */
public class MinimumDepthOfBinaryTree_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left)
                    , minDepth(root.right)) + 1;
        } else {
            return Math.min(minDepth(root.left),
                    minDepth(root.right)) + 1;
        }
    }
}
