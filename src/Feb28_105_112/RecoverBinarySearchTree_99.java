package Feb28_105_112;

import AmazonOA2_Feb10.TreeNode;

import java.util.Stack;

/**
 * Created by peidong on 3/22/17.
 */
public class RecoverBinarySearchTree_99 {
    pubc
    public void recoverTree(TreeNode root) {
        TreeNode wro1=null, wro2=null,pre=null;
        Stack<TreeNode> stack=new Stack<>();


        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(wro1==null &&(pre!=null && root.val<=pre.val)) {
                wro1=pre;

            }

            if(wro1!=null &&(pre!=null && root.val<=pre.val)) {
                wro2=root;

            }
            pre=root;
            root=root.right;

        }
        int temp=wro2.val;
        wro2.val=wro1.val;
        wro1.val=temp;
    }
}
