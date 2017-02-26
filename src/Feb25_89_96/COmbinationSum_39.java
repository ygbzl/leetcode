package Feb25_89_96;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class COmbinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new LinkedList<>();
        if(candidates==null || candidates.length==0) return res;
        Arrays.sort(candidates);
        backTrack(res, new LinkedList<Integer>(),candidates, 0, target);
        return res;

    }

    void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int index, int remain){
        if(remain<0) return;
        else if(remain==0) res.add(new LinkedList<>(temp));
        else {
            for(int i=index;i<nums.length;i++){
                temp.add(nums[i]);
                backTrack(res, temp, nums, i, remain-nums[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}
