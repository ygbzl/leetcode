package Jan10_25_32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhupd on 1/13/2017.
 */
public class BinaryTreeLevelOrderTraversalII_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<len;i++) {
                if (que.peek().left != null) {
                    que.offer(que.peek().left);
                }
                if (que.peek().right != null) {
                    que.offer(que.peek().right);
                }
                temp.add(que.poll().val);

            }
            list.add(0, temp);
        }
        return list;
    }

    public List<List<Integer>> leverOrderBFS(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        leverHelper(list, root, 0);
        return list;
    }

    public void leverHelper(List<List<Integer>> list, TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        leverHelper(list, root.left, height + 1);
        leverHelper(list, root.right, height + 1);
        list.get(list.size() - height - 1).add(root.val);
    }

}
