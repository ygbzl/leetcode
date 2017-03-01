package Feb26_97_104;

import AmazonOA2_Feb10.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhupd on 2/27/2017.
 */
public class MostFrequentSubtreeSum_508 {
    int max=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> temp=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        postOrder(root,map);
        for(int key:map.keySet()){
            if(map.get(key)==max) {
                temp.add(key);
            }
        }
        int[] res=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;


    }

    int postOrder(TreeNode root, Map<Integer,Integer> map) {
        if(root==null) return 0;
        int left= postOrder(root.left,map);
        int right= postOrder(root.right,map);

        int sum=left+right+root.val;
        int count=0;
        if(map.containsKey(sum)) {
            count=map.get(sum)+1;
        }
        map.put(sum,count);
        max=Math.max(max,count);
        return sum;
    }
}
