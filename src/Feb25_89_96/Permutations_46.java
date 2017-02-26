package Feb25_89_96;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhupd on 2/25/2017.
 */
public class Permutations_46 {


   public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return res;
        }

        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for(int i=0;i<nums.length;i++) {
                if(temp.contains(nums[i])) continue;;
                temp.add(nums[i]);
                backTrack(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
