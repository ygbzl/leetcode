package Jan6_17_24;

/**
 * Created by zhupd on 1/8/2017.
 */
public class FindPeakElement_162 {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int low = 0, high = len - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if ((mid == 0 || nums[mid] >= nums[mid - 1])
                    && (mid == len - 1 || nums[mid] >= nums[mid + 1])) {
                return mid;
            }
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return mid;
    }
}
