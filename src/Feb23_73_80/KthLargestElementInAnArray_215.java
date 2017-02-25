package Feb23_73_80;

import java.util.Arrays;

/**
 * Created by zhupd on 2/23/2017.
 */
public class KthLargestElementInAnArray_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
