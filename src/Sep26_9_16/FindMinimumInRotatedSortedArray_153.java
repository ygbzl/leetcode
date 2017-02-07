package Sep26_9_16;

/**
 * Created by zhupd on 1/3/2017.
 */
public class FindMinimumInRotatedSortedArray_153 {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.min(nums[1], nums[0]);
        }

        int low = 0, high = nums.length - 1;
        while (high-1 > low) {
            int mid = (low + high) / 2;
            if (nums[low] > nums[mid]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid;
            } else {
                return nums[low];
            }
        }
        return Math.min(nums[high], nums[low]);
    }
}


