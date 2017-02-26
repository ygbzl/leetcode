package Feb25_89_96;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class SubsetsII_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        if(nums==null ||nums.length==0) return res;
        Arrays.sort(nums);
        backTrack(res, new LinkedList<Integer>(), nums,0);
        return res;

    }

    void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int i) {
        res.add(new LinkedList<Integer>(temp));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            temp.add(nums[j]);
            backTrack(res,temp,nums,j+1);
            temp.remove(temp.size()-1);
        }
    }
}
