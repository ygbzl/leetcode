package Feb22_65_72;

import AmazonOA2_Feb10.TreeNode;

/**
 * Created by zhupd on 2/23/2017.
 */
public class LowestCommonAncestorOfABinarySeachTree_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, q, p);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, q, p);
        } else {
            return root;
        }
    }
}
