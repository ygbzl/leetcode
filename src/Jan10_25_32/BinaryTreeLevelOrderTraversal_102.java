package Jan10_25_32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhupd on 1/12/2017.
 */
public class BinaryTreeLevelOrderTraversal_102 {
    public static void main(String[] args) {
        int a = 5;
        double ss = 0.54;
        if (ss > 0.5) {
            System.out.println(ss);

        } else if (a > 4) {
            System.out.println("jaja");
        }
    }


    private List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if (root == null) {
            return list;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int level = que.size();
            List<Integer> templist = new ArrayList<>();
            for(int i=0;i<level;i++) {
                if (que.peek().left != null) {
                    que.offer(que.peek().left);
                }
                if (que.peek().right != null) {
                    que.offer(que.peek().right);
                }
                templist.add(que.poll().val);
            }
            list.add(templist);
        }
        return list;
    }

    private List<List<Integer>> levelOrder_recur(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        leverHelper(list, root, 0);
        return list;
    }

    private void leverHelper(List<List<Integer>> list, TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height >= list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(height).add(root.val);
        leverHelper(list, root.left, height + 1);
        leverHelper(list, root.right, height + 1);
    }

}









