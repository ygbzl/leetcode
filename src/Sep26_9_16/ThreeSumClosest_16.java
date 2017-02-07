package Sep26_9_16;

import java.util.Arrays;

/**
 * Created by zhupd on 12/30/2016.
 */
public class ThreeSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum= nums[i] + nums[j] + nums[k];
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }
}
