package Jan14_33_40;

/**
 * Created by zhupd on 1/14/2017.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            boolean case1 = isSameTree(p.left, q.left);
            boolean case2 = isSameTree(p.right, q.right);
            return case1 && case2;
        }
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
