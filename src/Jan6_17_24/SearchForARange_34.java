package Jan6_17_24;

/**
 * Created by zhupd on 1/8/2017.
 */
public class SearchForARange_34 {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        if (nums == null || size == 0) {
            return new int[]{-1, -1};
        }
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if ( low > size - 1 || nums[low] != target) {
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        res[0] = low;
        high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        res[1] =high;
        return res;
    }
}
