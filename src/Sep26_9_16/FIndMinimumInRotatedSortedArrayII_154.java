package Sep26_9_16;

/**
 * Created by zhupd on 1/4/2017.
 */
public class FIndMinimumInRotatedSortedArrayII_154 {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }

        int low = 0, high = nums.length - 1;
        while (low < high-1) {
            int mid = (low + high) / 2;
            if (nums[low] < nums[high]) {
                return nums[low];
            }
            if (nums[low] > nums[mid]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid;
            } else {
                low++;
            }
        }
        return Math.min(nums[low], nums[high]);
    }
}
