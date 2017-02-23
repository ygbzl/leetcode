package Feb14_57_64;

import AmazonOA2_Feb10.TreeNode;

/**
 * Created by zhupd on 2/22/2017.
 */
public class LowestCommonAncestorOfABinaryTree_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null|| p==root||q==root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else
        if (left != null) {
            return left;
        } else return right;
    }
}

