package Jan6_17_24;

/**
 * Created by zhupd on 1/8/2017.
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int flag=0;
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
                flag = 0;
            } else {
                low = mid + 1;
                flag = 1;
            }
        }
        if (high < 0) {
            return 0;
        }
        if (low > size - 1) {
            return size;
        }

        //return high+1; no flag
        if (flag == 0) {
            return high+1;
        } else {
            return low;
        }

    }
}
