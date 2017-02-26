package Feb25_89_96;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class CombinationSumII_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(candidates);
        backTrack(res, new LinkedList<Integer>(), candidates, target,0);
        return res;

    }

    void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int remain, int index){
        if(remain<0) return;
        if(remain==0) res.add(new LinkedList<>(temp));
        else {
            for(int i=index;i<nums.length;i++){
                if(i>index && nums[i]==nums[i-1]) continue;
                temp.add(nums[i]);
                backTrack(res, temp, nums, remain-nums[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
