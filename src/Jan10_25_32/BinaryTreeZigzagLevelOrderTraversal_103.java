package Jan10_25_32;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhupd on 1/13/2017.
 */
public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        boolean reorder = false;
        levelHelper(list, root, 0, reorder);
        return list;
    }

    public void levelHelper(List<List<Integer>> list, TreeNode root, int height, boolean reorder) {
        if (root == null) {
            return;
        }
        if (height >= list.size()) {
            list.add(new LinkedList<>());
        }
        if (!reorder) {
            list.get(height).add(root.val);
            reorder = true;
        } else {
            list.get(height).add(0, root.val);
            reorder = false;
        }
        if (root.left != null) {
            levelHelper(list, root.left, height + 1, reorder);
        }
        if (root.right != null) {
            levelHelper(list, root.right, height + 1, reorder);
        }
    }

    public List<List<Integer>> zigzagDFS(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        que.offer(root);
        boolean reorder = false;
        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> temp = new LinkedList<>();
            for(int i=0;i<len;i++) {
                if (que.peek().left != null) {
                    que.offer(que.peek().left);
                }
                if (que.peek().right != null) {
                    que.offer(que.peek().right);
                }
                if (!reorder) {
                    temp.add(que.poll().val);
                } else {
                    temp.add(0, que.poll().val);
                }
            }
            list.add(temp);
            reorder = !reorder;
        }
        return list;
    }
}
