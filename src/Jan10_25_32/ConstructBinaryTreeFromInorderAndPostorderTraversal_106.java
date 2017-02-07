package Jan10_25_32;

import java.util.HashMap;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * Created by zhupd on 1/11/2017.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private  TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder,
                      int ps, int pe, HashMap<Integer, Integer> map) {
        if (ps > pe || is > ie) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        int temp = map.get(postorder[pe]);
        TreeNode left = buildTree(inorder, is, temp - 1, postorder, ps, ps + temp - is - 1, map);
        TreeNode right = buildTree(inorder, temp + 1, ie, postorder, ps + temp - is, pe - 1, map);
        root.left = left;
        root.right = right;
        return root;
    }
}

