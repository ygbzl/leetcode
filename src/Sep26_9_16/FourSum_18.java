package Sep26_9_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhupd on 12/30/2016.
 */
public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int begin = j + 1, end = nums.length - 1;
                while (end > begin) {
                    int sum = nums[i] + nums[j] + nums[begin] + nums[end];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[begin], nums[end]));
                        while (end > begin && nums[begin] == nums[begin + 1]) {
                            begin++;
                        }
                        while (end > begin && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        begin++;
                        end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        begin++;
                    }
                }

            }
        }
        return res;
    }
}
