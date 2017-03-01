package Feb26_97_104;

import AmazonOA2_Feb10.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhupd on 2/26/2017.
 */
public class BinaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<Integer> res=new ArrayList<>();

        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
                if(i==size-1) res.add(cur.val);
            }
        }

        return res;
    }
}
