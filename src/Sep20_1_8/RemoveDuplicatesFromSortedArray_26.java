package Sep20_1_8;

/**
 * Created by zhupd on 12/24/2016.
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicated(int[] nums) {
        int j=0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
