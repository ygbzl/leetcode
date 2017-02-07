package Sep20_1_8;

/**
 *
 * Created by zhupd on 12/25/2016.
 */
public class RemoveDuplicatesFromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int j = 0;
        for(int i=1;i<nums.length;i++) {
            if (nums[j] == nums[i]) {
                count++;
                if (count < 2) {
                    nums[++j] = nums[i];
                }
            } else {
                nums[++j] = nums[i];
                count = 0;
            }
        }
        return j + 1;

    }
}
