package Feb11_49_56;

import AmazonOA2_Feb10.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 * Created by zhupd on 2/12/2017.1
 */
public class ValidateBinarySearchTree_98 {
    public boolean isValidBST(TreeNode root) {
        if(root==null) {
            return true;
        }
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public boolean helper(TreeNode root, long min, long max) {
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;

        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
