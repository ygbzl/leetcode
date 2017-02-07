package Jan14_33_40;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhupd on 1/14/2017.
 */
public class BinaryTreePostorderTraversal_145 {
    /* /*/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur =  root;
        TreeNode pre = null;

        if (root == null) {
            return list;
        }
        stack.push(root);
        while ( !stack.isEmpty()) {
            cur = stack.peek();
            if (pre == null || pre.left == cur || pre.right == cur) {
                if (cur.left != null) {
                    stack.push(cur.left);
                } else if (cur.right != null) {
                    stack.push(cur.right);
                }
            } else if (cur.left == pre) {
                if (cur.right != null) {
                    stack.push(cur.right);
                }
            } else {
                list.add(cur.val);
                stack.pop();
            }
            pre = cur;

        }
        return list;
    }

}
