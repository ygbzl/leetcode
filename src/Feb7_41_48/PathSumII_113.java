package Feb7_41_48;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhupd on 2/7/2017.
 */
public class PathSumII_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        if (root == null) {
            return res;
        }

        findPath(root, sum, res, cur);
        return res;

    }

        void findPath(TreeNode root, int sum, List<List<Integer>> res, List<Integer> cur) {
        cur.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(cur));
        }
        if (root.left != null) {
            findPath(root.left, sum - root.val, res, cur);
        }
        if (root.right != null) {
            findPath(root.right, sum - root.val, res, cur);
        }
            cur.remove(cur.size() - 1);
    }
}

