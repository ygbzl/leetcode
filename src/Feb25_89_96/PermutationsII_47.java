package Feb25_89_96;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class PermutationsII_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        if(nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        backTrack(res, new LinkedList<Integer>(), nums, new boolean[nums.length]);
        return res;
    }

    void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] state){
        if(temp.size()==nums.length) res.add(new LinkedList<>(temp));
        else {
            for(int i=0;i<nums.length;i++) {
                if(state[i] || i>0 && state[i-1] && nums[i]==nums[i-1]) continue;
                state[i]=true;
                temp.add(nums[i]);
                backTrack(res,temp,nums,state);
                state[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
